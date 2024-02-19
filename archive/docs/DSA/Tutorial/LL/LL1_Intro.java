package misc.Code.LL;
// LL is a linear DS

// It has Per node memory allocation, meaning it is not contiguous.
// It has 2 parts - Data and Address. Data is the actual data and Address is the pointer to the next node.

// Those are private because we don't want the user to access them directly.
// So we make a class called Node
// it has data, next

import java.util.*;

public class LL1_Intro {

    private Node head;
    private Node tail;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // * Adding first */
    // Node newNode = new Node(data); is a statement in the LinkedList class that
    // creates a new node with the specified data and assigns it to the reference
    // variable newNode.
    // Node(data) is a constructor call that creates a new Node object with a given
    // data value.
    // When you call Node(data), a new Node object is created with the specified
    // data value, and the constructor sets the data instance variable of the node
    // to that value. The next instance variable of the node is initially set to
    // null, since this node does not yet have a next node in the list.

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // * Adding last */
    // The currNode points to the head
    // We then keep going as long as next is not null.
    // We stop at the very last element.
    // Then we simply make it's next as newNode that we defined earlier

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null)
            currNode = currNode.next;

        currNode.next = newNode;

    }

    public void deleteFirst() {
        head = head.next;
    }

    // * Deleting the last */
    // We go the second last element in the LL
    // in the for loop, we are setting the prev, current
    // current stops at last, prev at second last.
    // we make prev's next as null
    // so the last got deleted.

    public void deleteLast() {

        Node currNode = head;
        Node prevNode = null;

        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        prevNode.next = null;
    }

    public void specificOne(int data) {

        Node currNode = head;
        Node prevNode = null;

        while (currNode.next != null && currNode.data != data) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        prevNode.next = currNode.next;
    }

    public static void main(String[] args) {

        LL1_Intro list = new LL1_Intro();

        list.addFirst(100);
        list.addFirst(101);
        list.addFirst(102);
        list.addFirst(103);
        list.addFirst(104);
        list.addFirst(105);
        list.addFirst(106);
        list.addFirst(107);

        list.addLast(99);
        list.addLast(98);

        // list.deleteFirst();
        // list.deleteLast();
        list.specificOne(100);
        list.printList();

    }

}
