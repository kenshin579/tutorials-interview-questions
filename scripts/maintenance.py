#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import argparse
import fnmatch
import os
import re
import shutil
import sys

################################################################################################
# todo :
#
################################################################################################


################################################################################################
# Constants
#
################################################################################################

README_HEADER_FILE = 'data/HEADER.md'
SRC_ROOT_DIR = '../src/main/java/com'
EXCLUDE_DIRS = ['utils', 'common']
FILE_PATTERN_JAVA = '*.java'
README_FILE = '../README.md'


################################################################################################
# Functions
#
################################################################################################

def get_statistics(contents):
    result = {}

    # todo: 여기서 부터 다시하면 됨
    for parent_folder_key in contents.keys():
        result[parent_folder_key]= len(contents[parent_folder_key])

    return result


def update_readme(src):
    files = get_list_of_files(src, EXCLUDE_DIRS)

    contents = generate_contents(files)
    study_stats = get_statistics(contents)
    print('study_stats', study_stats)

    shutil.copyfile(README_HEADER_FILE, README_FILE)

    first_line = True
    with open(README_FILE, "a") as f:

        # stats
        for parent_folder_key in study_stats.keys():
            f.write('| ' + parent_folder_key + ' | ' + str(study_stats[parent_folder_key]) + ' |\n')

        f.write("\n")
        # contents
        for parent_folder_key in contents.keys():
            f.write('## ' + parent_folder_key + '\n')
            for algorithm_info in contents[parent_folder_key]:
                if algorithm_info['title'].lower() == 'leetcode':
                    if first_line:
                        first_line = False

                else:
                    f.write('* ' + algorithm_info['title'] + ' (' + algorithm_info['filename'] + ')\n')
            f.write('\n')

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

def generate_contents(files):
    result = {}

    for file in files:
        filename = os.path.basename(file)
        parent_folder = get_parent_of_childfolder('com', file)
        print('file', file)
        print('filename', filename)
        print('parent_folder', parent_folder)

        with open(file) as f:
            for line in f:
                if line.startswith("/**"):
                    problem_title = escape_dot(re.sub('\*\s+', '', next(f, '').strip()))
                    print('title', problem_title)

                    if parent_folder in result:
                        sub_list = result[parent_folder]
                        sub_list.append({
                            'filename': filename,
                            'title': problem_title
                        })
                        result[parent_folder] = sub_list
                    else:
                        sub_list = [{
                            'filename': filename,
                            'title': problem_title
                        }]
                        result[parent_folder] = sub_list
                    break
            print()
    print('result', result)
    return result


def get_list_of_files(src, exclude_dirs):
    result = []
    for root, dirs, files in os.walk(src):
        dirs[:] = [d for d in dirs if d not in exclude_dirs]

        for filename in fnmatch.filter(files, FILE_PATTERN_JAVA):
            src_filename = os.path.abspath(os.path.join(root, filename))
            # print('src_filename', src_filename)
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

    print('args', args)

    if args.update:
        update_readme(SRC_ROOT_DIR)


if __name__ == "__main__":
    sys.exit(main())
