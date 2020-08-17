package com.java.examples.linkedlist;

import lombok.ToString;

@ToString
public class LinkedList<T> {
    Node<T> head;
    private int size = 0;

    public void insert(T data) {
        size++;
        if (head == null) {
            head = new Node<>(data);
            return;
        }

        Node<T> currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new Node<>(data);
    }

    //todo: 여기서부터 하면 됨
    public void remove(T data) {
        Node<T> currNode = head;

        if (data == currNode.data) {
            head = currNode.next;
            size--;
            return;
        }

        while (currNode.next != null && currNode.next.data != data) {
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
        size--;
    }

    public T getIndex(int index) {
        int count = 0;
        Node<T> currNode = head;
        while (count < index && currNode != null) {
            currNode = currNode.next;
            count++;
        }
        return currNode.data;
    }

    public LinkedList<Integer> calculateSumOfLL(Node<Integer> n1, Node<Integer> n2) {

        return null;
    }

    public void print() {
        Node<T> currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public int size() {
        return this.size;
    }


    /**
     * Not quite work, yet.
     */
    public void removeWhiteSpaces() {
        Node<T> currNode = head;
        Node<T> prevNode = null;

        while (currNode != null) {
            Character ch1 = (Character) currNode.data;

            Character ch2 = (Character) currNode.next.data;

            if (ch1 == ' ' && ch2 == ' ') { // remove current data
                prevNode.next = currNode.next;
            } else {
                prevNode = currNode;
            }
            currNode = currNode.next;
        }

    }

    public void reverse() {
        Node currNode = head;
        Node tmpNode;
        Node headNode = null;

        while (currNode != null) {
            tmpNode = currNode;
            currNode = currNode.next;
            tmpNode.next = headNode;
            headNode = tmpNode;
        }

        head = headNode;
    }

    public LinkedList<Integer> sumUpTwoLinkedListV1(Node<Integer> n1, Node<Integer> n2) {
        LinkedList<Integer> sumLL = new LinkedList<Integer>();

        Node<Integer> currN1 = n1;
        Node<Integer> currN2 = n2;
        int sum, carryValue = 0;
        int n1Value = 0, n2Value = 0;

        while (currN1 != null || currN2 != null) {
            if (currN1 == null)
                n1Value = 0;
            else
                n1Value = currN1.data;
            if (currN2 == null)
                n2Value = 0;
            else
                n2Value = currN2.data;

            sum = n1Value + n2Value + carryValue;
            System.out.println(sum);

            if (sum >= 10) {
                sum = sum - 10;
                carryValue = 1;
            }

            sumLL.insert(sum);

            if (currN1 != null)
                currN1 = currN1.next;
            if (currN2 != null)
                currN2 = currN2.next;
        }

        return sumLL;
    }

    public LinkedList<Integer> sumUpTwoLinkedListsV2(Node head1, Node head2) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        int sum, carryover = 0, remainder = 0;

        while (head1 != null & head2 != null) {
            sum = (Integer) head1.data + (Integer) head2.data + carryover;
            if (sum > 9) {
                carryover = sum / 10;
                sum = sum - 10;
            } else {
                carryover = 0;
            }

            result.insert(sum);

            head1 = head1.next;
            head2 = head2.next;
        }

        // process left nodes
        while (head1 != null) {
            result.insert((Integer) head1.data);
            head1 = head1.next;
        }

        while (head2 != null) {
            result.insert((Integer) head2.data);
            head2 = head2.next;
        }

        return result;
    }
}