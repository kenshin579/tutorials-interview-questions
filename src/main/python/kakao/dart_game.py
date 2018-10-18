#!/usr/bin/env python3
import math
import sys


def main():
    pass


class Stack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def size(self):
        return len(self.items)

    def peek(self):
        return self.items[-1]


def is_option(ch):
    if ch == '#' or ch == '*':
        return True
    else:
        return False


def is_symbol(ch):
    if is_bonus(ch) or is_option(ch):
        return True
    else:
        return False


def is_bonus(ch):
    if ch == 'S' or ch == 'D' or ch == 'T':
        return True
    else:
        return False


def parse_str(str):
    number_stack = Stack()
    operator_stack = Stack()

    for each_char in str:
        print("ch", each_char)
        if is_symbol(each_char):
            operator_stack.push(each_char)
        else:
            number_stack.push(each_char)
    return number_stack, operator_stack


def get_score(str, count):
    score_dit = {
        '*': 2,
        '#': -1,
        '*#': -2,
        '**': 4
    }

    score = score_dit.get(str)
    if score == None
        return 1
    else:
        return score


def get_calculate_value(num, opr, special_symbol_list, count):
    result = 0
    if opr == 'T':
        result = math.pow(int(num), 3)
    if opr == 'D':
        result = math.pow(int(num), 2)
    if opr == 'S':
        result = math.pow(int(num), 1)

    special_score = get_score(special_symbol_list, count)
    print("special_score", special_score)
    result = result * special_score
    print("result", result)

    return int(result)


def solution(str):
    number_stack, operator_stack = parse_str(str)
    print("number_stack", number_stack.size())
    print("operator_stack", operator_stack.size())
    special_symbol_list = ""
    total_value = 0
    count = 0

    while number_stack.size() != 0:
        num = number_stack.pop()
        print("num", num)
        opr = operator_stack.pop()
        if is_option(opr):
            special_symbol_list = special_symbol_list + opr
            print("special_symbol_list", special_symbol_list)
            opr = operator_stack.pop()
            print("opr", opr)
        count = count + 1
        total_value = total_value + get_calculate_value(num, opr, special_symbol_list, count)
        print("total_value", total_value)
        print()

    return total_value


if __name__ == "__main__":
    sys.exit(main())
