package com.hackerrank.common.struct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
    }
}
