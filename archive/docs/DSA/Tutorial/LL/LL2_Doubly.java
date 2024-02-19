package misc.Code.LL;
// In this we will talk abotu Doubly Linked List

public class LL2_Doubly {

    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    Node head = null;
    Node tail = null;

    // * Adding a value to the first of doubly LinkedList */
    // We make the newNode's next as head and head's previous as newNode
    // Then we make the newNode as head
    // As a result we have added a new node to the first of the doubly linked list

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    // * Adding a value to the end of the LinkedList */
    // We traverse through the entire list
    // After that as soon as we reach the end, we add the list

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
        newNode.previous = currNode;
        newNode.next = null;

    }

    // * Deleting a value from the first */

    public void deleteFirst() {
        if (head == null)
            return;

        head = head.next;
        head.previous = null;
    }

    // * Deleting a value from the last */

    public void deleteLast() {
        if (head == null)
            return;

        Node currNode = head;

        while (currNode.next != null)
            currNode = currNode.next;

        Node endNode = currNode.previous;
        endNode.next = null;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL2_Doubly list = new LL2_Doubly();

        list.addFirst(100);
        list.addFirst(101);
        list.addFirst(102);
        list.addFirst(103);
        list.addFirst(104);
        list.addFirst(105);
        list.addFirst(106);
        list.addFirst(107);

        list.printList();

        list.addLast(99);
        list.addLast(98);

        list.printList();

        list.deleteFirst();
        list.deleteFirst();

        System.out.print("After deleting the first 2 : ");
        list.printList();

        list.deleteLast();
        list.deleteLast();

        System.out.print("After deleting the last 2 : ");
        list.printList();
    }
}