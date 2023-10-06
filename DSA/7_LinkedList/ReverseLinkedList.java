class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;

        // Take a node, set the next as current.next
        // Now that we have next saved - make current.next as prev
        // reset the prev as the current node
        // and now move the pointer called current to the next

        // That way I took a node, linked it's next to it's previous element
        // Updated what the next previous element would be
        // Then i moved to the next node

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
