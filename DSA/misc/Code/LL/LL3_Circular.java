package misc.Code.LL;
// Implementations of CircularLinked List

import java.util.*;

public class LL3_Circular {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    // * Adding a value to the start of the LinkedList */
    // We make a newNode
    // If the head is null, we make the newNode as head and tail
    // Else we make the newNode as head and tail.next as head so that the LinkedList
    // is circular

    void addToFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    };

    // * Adding a value to the end of the LinkedList */
    // We take the current tail, and make it's next as newNode
    // now the current tail is the 2nd last element
    // after that we make the tail as newNode, so tail is now the last element
    // after that we make the tail.next as head so that the LinkedList is circular

    void addToLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;

    }

    // * Deleting a node from the start of the LinkedList */
    // We make the head as head.next, in this way the first element is skipped
    // Then we make the tail.next as head so that the LinkedList is circular

    void deleteFirst() {
        if (head == null)
            return;

        head = head.next;
        tail.next = head;
    }

    // * Deleting a node from the end of the LinkedList */

    void deleteEnd() {
        if (head == null)
            return;

        Node currNode = head;
        Node prevNode = null;

        while (currNode.next != head) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        // so i have traversed the loop
        // currNode is the last element
        // prevNode is the 2nd last element

        prevNode.next = head;
        tail = prevNode;

    }

    // * Print the head and tail */

    void printHeadTail() {
        System.out.println("The head is " + head.data);
        System.out.println("The tail is " + tail.data);
    }

    public static void main(String[] args) {
        LL3_Circular list = new LL3_Circular();

        list.addToFirst(10);
        list.addToFirst(9);
        list.addToFirst(8);
        list.addToFirst(7);
        list.addToFirst(6);
        list.addToFirst(5);
        list.addToFirst(4);
        list.addToFirst(3);
        list.addToFirst(2);
        list.addToFirst(1);

        list.printHeadTail();

        list.addToLast(11);

        list.printHeadTail();

        list.deleteEnd();
        list.deleteEnd();
        list.deleteEnd();
        list.printHeadTail();
    }
}