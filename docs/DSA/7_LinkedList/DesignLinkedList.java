class Node {
    int value;
    Node next = null;

    public Node(int value) {
        this.value = value;
    }
}

public class DesignLinkedList {
    Node head = null;
    int size = 0;

    public DesignLinkedList() {
        head = null;
    }

    public int get(int index) {
        if (index >= size || index < 0)
            return -1;
        Node temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        return temp != null ? temp.value : 0;
    }

    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        size++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = new Node(val);
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index == size) {
            addAtTail(val);
        } else if (index > size) {
            return;
        } else {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
            } else if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node current = head;
                Node previous = null;
                for (int i = 0; i < index; i++) {
                    previous = current;
                    current = current.next;
                }
                newNode.next = current;
                previous.next = newNode;
            }
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0)
            return;
        Node current = head;
        Node previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            head = head.next;
        } else {
            previous.next = current.next;
        }
        size--;
    }
}
