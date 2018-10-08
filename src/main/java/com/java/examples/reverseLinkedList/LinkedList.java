package com.java.examples.reverseLinkedList;


public class LinkedList<T> {
    Node<T> head;

    public void insert(T data) {
        if (head == null) {
            head = new Node<T>(data);
            return;
        }

        Node<T> currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = new Node<T>(data);
    }

    public void remove(T data) {
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node<T> currNode = head;
        Node<T> prevNode = null;

        while (currNode != null) {
            if (currNode.data != data) {
                prevNode = currNode;
                currNode = currNode.next;
            } else { // found
                prevNode.next = currNode.next;
                break;
            }
        }

    }

    public LinkedList<Integer> calculateSumOfLL(Node<Integer> n1, Node<Integer> n2) {
        LinkedList<Integer> sumLL = new LinkedList<Integer>();

        Node<Integer> currN1 = n1;
        Node<Integer> currN2 = n2;
        int sum, carryValue = 0;
        int n1Value = 0, n2Value = 0;


        while (currN1 != null || currN2 != null) {
            if (currN1 == null)
                n1Value = 0;
            else n1Value = currN1.data;
            if (currN2 == null)
                n2Value = 0;
            else n2Value = currN2.data;

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

    public void print() {
        Node<T> currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "_");
            currNode = currNode.next;
        }
        System.out.println();
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

    public LinkedList<Integer> calculateSumOfLL2(Node head1, Node head2) {
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


    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<Character>();
//		String test = "a  b c    d";
//		String test = "a  b";
//		for (Character each : test.toCharArray()) {
//			list.insert(each);
//		}
//
//		list.print();
//		list.removeWhiteSpaces();
//		System.out.println("--------------------------");
//		list.print();

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        System.out.println(list1.getClass().getName());
        list1.insert(3);
        list1.insert(1);
        list1.insert(5);
        list1.insert(2);
        list1.insert(9);
        list1.print();

        list2.insert(5);
        list2.insert(9);
        list2.insert(2);
        list2.print();

//		list1.reverse();
//		list1.print();
//

//		LinkedList<Integer> result = list1.calculateSumOfLL(list1.head, list2.head);
//		result.print();

        LinkedList<Integer> result = list1.calculateSumOfLL2(list1.head, list2.head);
        result.print();

//		LinkedList<Integer> list = new LinkedList<Integer>();
//
//		list.insert(3);
//		list.insert(1);
//		list.insert(5);
//		list.insert(4);
//
//		list.print();
//
//		list.remove(3);
////		list.remove(1);
////		list.remove(5);
////		list.remove(4);
//		list.print();


    }
}

class Node<T> {
    T data;
    Node next = null;

    Node(T data) {
        this.data = data;
    }
}
