package com.java.examples.linkedlist;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Node<T> {
    T data;
    Node<T> next = null;

    Node(T data) {
        this.data = data;
    }
}
