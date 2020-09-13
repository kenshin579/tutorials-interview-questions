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


def generate_contents(files):
    result = []
    for file in files:
        print('file', file)
        print('basename', os.path.basename(file))
        print('parent')

        with open(file) as f:
            for line in f:
                if line.startswith("/**"):
                    problem_title = re.sub('\*\s+', '', next(f, '').strip())
                    print(problem_title)
                    result.append({'title' : problem_title})
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
