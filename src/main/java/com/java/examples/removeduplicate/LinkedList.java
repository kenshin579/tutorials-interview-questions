package com.java.examples.removeduplicate;

import java.util.HashSet;

/***********************************************************
 * @author: Frank Oh (kenshin579@gmail.com)
 *
 * Description: Efficiently remove duplicates from an array of
 * integers.
 *
 * Ex. [1,2,3,1,5,3,7] -> [1,2,3,5,7]
 *
 * Comment:
 * - Using customized LinkedList with HashTable to remove
 * duplicates
 *
 * Known Problems: None
 *
 ***********************************************************/

public class LinkedList {
    Node head;        // head pointer

    /**
     * Insert a node at the end of linked list
     *
     * @param data - integer value
     */
    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }

            // append the data at the end
            currNode.next = new Node(data);
        }
    }

    /**
     * Delete a node with the given data value
     *
     * @param data - integer value
     */
    public void delete(int data) {
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            if (currNode.next.data == data) {
                currNode.next = currNode.next.next;
                break;
            }
            currNode = currNode.next;
        }

    }

    /**
     * Print all values in the LinkedList
     */
    public void print() {

        for (Node currNode = head; currNode != null; currNode = currNode.next) {
            System.out.println(currNode.data);
        }
    }

    /**
     * Remove duplicate data from the LinkedList
     */
    public void removeDuplicate() {
        HashSet<Integer> uniqueSet = new HashSet<Integer>(); // used to keep track of dataset

        Node currNode = head;
        Node prevNode = null;

        while (currNode != null) {
            if (!uniqueSet.contains(currNode.data)) {
                uniqueSet.add(currNode.data);
                prevNode = currNode;        // saving previous node for deletion
            } else {
                // duplicate found - need to delete current node
                prevNode.next = currNode.next;
            }
            currNode = currNode.next;    // go to next node
        }
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();

        int[] arr = {1, 2, 3, 1, 5, 3, 7}; // sample array

        // converting Array to LinkedLisit data structure
        for (int i = 0; i < arr.length; i++) {
            myLinkedList.insert(arr[i]);
        }

        myLinkedList.print();

        System.out.format("\n--------- After removing duplicates ------------\n\n");

        myLinkedList.removeDuplicate();

        myLinkedList.print();

    }

}


/**
 * Define Node Class
 */
class Node {
    int data;
    Node next = null;

    public Node(int d) {
        this.data = d;
    }

    public Node(int d, Node next) {
        this.data = d;
        this.next = next;
    }
}
