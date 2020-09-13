#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import argparse
import fnmatch
import os
import re
import sys

################################################################################################
# todo :
#
################################################################################################


################################################################################################
# Constants
#
################################################################################################
from os.path import dirname, basename

SRC_ROOT_DIR = '../src/main/java/com'
EXCLUDE_DIRS = ['utils', 'common']
FILE_PATTERN_JAVA = '*.java'


################################################################################################
# Functions
#
################################################################################################

def update_readme(src):
    files = get_list_of_files(src, EXCLUDE_DIRS)

    generate_contents(files)


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


def generate_contents(files):
    result = {}

    for file in files:
        print('file', file)
        print('basename', os.path.basename(file))
        parent_folder = get_parent_of_childfolder('com', file)
        print('parent_folder', parent_folder)
        # todo: 여기서 부터 하면 됨
        if parent_folder in result:
            pass

        with open(file) as f:
            for line in f:
                if line.startswith("/**"):
                    problem_title = re.sub('\*\s+', '', next(f, '').strip())
                    print(problem_title)
                    result.append({
                        'title': problem_title
                    })
                    break
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
