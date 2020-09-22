#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import argparse
import fnmatch
import os
import re
import shutil
import sys
import logging
from datetime import datetime

################################################################################################
# todo :
#
################################################################################################


################################################################################################
# Constants
#
################################################################################################
ROOT_DIR = os.path.dirname(os.path.dirname(os.path.realpath(__file__)))
README_HEADER_FILE = os.path.join(ROOT_DIR, 'scripts/data/HEADER.md')
SRC_ROOT_DIR = os.path.join(ROOT_DIR, 'src/main/java/com')
EXCLUDE_DIRS = ['utils', 'common']
FILE_PATTERN_JAVA = '*.java'
README_FILE = os.path.join(ROOT_DIR, 'README.md')


################################################################################################
# Functions
#
################################################################################################

def get_statistics(contents):
    result = {}

    for parent_folder_key in contents.keys():
        logging.debug('parent_folder_key : %s', parent_folder_key)
        sub_total = {
            parent_folder_key: len(contents[parent_folder_key])
        }

        if parent_folder_key == 'leetcode':
            result['leetcode'] = {
                'difficulty': {
                    'Easy': 0,
                    'Medium': 0,
                    'Hard': 0
                },
                'tags': {
                }
            }

            for each_problem in contents[parent_folder_key]:
                result[parent_folder_key]['difficulty'][each_problem['difficulty']] = result[parent_folder_key]['difficulty'][
                                                                                              each_problem['difficulty']] + 1
                if result[parent_folder_key]['tags'].get(each_problem['tags']) is not None:
                    result[parent_folder_key]['tags'][each_problem['tags']] = result[parent_folder_key]['tags'][each_problem['tags']] + 1
                else:
                    result[parent_folder_key]['tags'][each_problem['tags']] = 1

        if result.get('total') is not None:
            result['total'].update(sub_total)
        else:
            result['total'] = sub_total

    logging.debug('result : %s', result)
    return result

def update_readme(src):
    files = get_list_of_files(src, EXCLUDE_DIRS)

    contents = parse_source_files(files)
    study_stats = get_statistics(contents)
    logging.debug('study_stats : %s', study_stats)

    shutil.copyfile(README_HEADER_FILE, README_FILE)

    first_line = True
    with open(README_FILE, "a") as f:
        f.write('\nUpdated ' + datetime.now().strftime('%Y-%m-%d') + '\n\n')
        f.write('### 스터디한 알고리즘\n')
        f.write('| 사이트  | 총 수 |\n')
        f.write('| :---------: | :-----------: |\n')

        # stats
        for parent_folder_key in study_stats['total'].keys():
            logging.debug('parent_folder_key : %s', parent_folder_key)
            f.write('| ' + parent_folder_key + ' | ' + str(study_stats['total'][parent_folder_key]) + ' |\n')

        f.write("\n")
        # contents
        for parent_folder_key in contents.keys():
            f.write('## ' + parent_folder_key + '\n\n')
            for algorithm_info in contents[parent_folder_key]:

                if parent_folder_key == 'leetcode':
                    # logging.info('title :(%s)', int(extract_text('([0-9]+)', algorithm_info['title'])))

                    if first_line:
                        first_line = False
                        print_rank_stats(f, parent_folder_key, study_stats)

                        print_tags_stats(f, parent_folder_key, study_stats)

                f.write('* ' + algorithm_info['title'] + ' (' + algorithm_info['filename'] + ')\n')
            f.write('\n')


def print_tags_stats(f, parent_folder_key, study_stats):
    f.write('| Tags | ')
    for tag in sorted(study_stats[parent_folder_key]['tags'].keys()):
        f.write(tag + ' | ')
    f.write('\n')
    for i in range(len(study_stats[parent_folder_key]['tags'].keys()) + 1):
        f.write('| :------: ')
    f.write('|\n')
    f.write('| 총 수 ')
    for tag in sorted(study_stats[parent_folder_key]['tags'].keys()):
        f.write('| ' + str(study_stats[parent_folder_key]['tags'][tag]) + ' ')
    f.write('|\n\n')


def print_rank_stats(f, parent_folder_key, study_stats):
    f.write('| 등 급 | Easy | Medium | Hard | \n')
    f.write('| :------: | :------: | :------: | :------: |\n')
    f.write('| 총 수  | ' + str(study_stats[parent_folder_key]['difficulty']['Easy']) + ' | ' +
            str(study_stats[parent_folder_key]['difficulty']['Medium']) + ' | ' +
            str(study_stats[parent_folder_key]['difficulty']['Hard']) + ' | \n\n')


def get_parent_of_childfolder(childfolder, full_file):
    next = False
    for path in split_path(full_file):
        if next:
            return path
        if path == childfolder:
            next = True


def split_path(path):
    allparts = []
    while 1:
        parts = os.path.split(path)
        if parts[0] == path:  # sentinel for absolute paths
            allparts.insert(0, parts[0])
            break
        elif parts[1] == path:  # sentinel for relative paths
            allparts.insert(0, parts[1])
            break
        else:
            path = parts[0]
            allparts.insert(0, parts[1])
    return allparts


def escape_dot(pattern):
    _special_chars_map = {i: '\\' + chr(i) for i in b'\\.'}

    return pattern.translate(_special_chars_map)


def parse_source_files(files):
    result = {}

    for file in files:
        filename = os.path.basename(file)
        parent_folder = get_parent_of_childfolder('com', file)
        # logging.debug('file : %s', file)
        # logging.debug('filename : %s', filename)
        # logging.debug('parent_folder : %s', parent_folder)

        with open(file) as f:
            for line in f:
                # logging.debug('line', line)
                if line.startswith("/**"):
                    # problem_title = escape_dot(re.sub('\*\s+', '', next(f, '').strip()))
                    problem_title = escape_dot(extract_text(' * (.*)', next(f, '').strip()))

                    if parent_folder == 'leetcode':
                        difficulty = extract_text(' * Difficulty : ([a-zA-Z]+)', next(f, '').strip())
                        tags = extract_text(' * Tags : ([a-zA-Z]+)', next(f, '').strip())

                    if parent_folder in result:
                        sub_list = result[parent_folder]
                        if parent_folder == 'leetcode':
                            sub_list.append({
                                'filename': filename,
                                'title': problem_title,
                                'difficulty': difficulty,
                                'tags': tags
                            })
                        else:
                            sub_list.append({
                                'filename': filename,
                                'title': problem_title
                            })
                        result[parent_folder] = sub_list
                    else:
                        if parent_folder == 'leetcode':
                            sub_list = [{
                                'filename': filename,
                                'title': problem_title,
                                'difficulty': difficulty,
                                'tags': tags
                            }]
                        else:
                            sub_list = [{
                                'filename': filename,
                                'title': problem_title
                            }]
                        result[parent_folder] = sub_list
                    break

            # logging.debug('\n')
    logging.debug('result : %s', result)

    # sort leetcode by problem #
    sort_leetcode_list = sorted(result['leetcode'], key=lambda x : int(extract_text('([0-9]+)', x['title'])))
    result['leetcode'] = sort_leetcode_list

    return result


def extract_text(regex_str, line):
    match = re.search(regex_str, line)
    logging.debug('match : %s <-- (%s)', match, line)
    if match:
        extract_str = match.group(1)
        return extract_str
    else:
        return None


def get_list_of_files(src, exclude_dirs):
    result = []
    for root, dirs, files in os.walk(src):
        dirs[:] = [d for d in dirs if d not in exclude_dirs]

        for filename in fnmatch.filter(files, FILE_PATTERN_JAVA):
            src_filename = os.path.abspath(os.path.join(root, filename))
            # logging.debug('src_filename', src_filename)
            found = False
            if os.path.isfile(src_filename):
                with open(src_filename) as f:
                    if '@Deprecated' in f.read():
                        found = True
                if not found:
                    result.append(src_filename)
    return result


################################################################################################
# Main function
#
################################################################################################


def main():
    parser = argparse.ArgumentParser(description="Maintenance script")

    parser.add_argument("-u", "--update", action='store_true',
                        help="Update README file")

    if len(sys.argv[1:]) == 0:
        parser.print_help()
        parser.exit()

    args = parser.parse_args()

    logging.debug('args : %s', args)

    if args.update:
        update_readme(SRC_ROOT_DIR)


if __name__ == "__main__":
    format = '[%(asctime)s,%(msecs)d] [%(levelname)-4s] %(filename)s:%(funcName)s:%(lineno)d %(message)s'
    logging.basicConfig(format=format, level=logging.DEBUG,
                        datefmt='%Y-%m-%d:%H:%M:%S')
    sys.exit(main())
