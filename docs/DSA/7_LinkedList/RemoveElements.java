// https://leetcode.com/problems/remove-linked-list-elements

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

public class RemoveElements {
    public ListNode removeElements(ListNode head, int target) {

        if (head == null)
            return head;

        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        head = dummyHead;
        ListNode current = head.next;
        ListNode prev = head;

        while (current != null) {
            if (current.val == target) {
                prev.next = current.next;
            } else {
                prev = prev.next;
            }

            current = current.next;
        }

        return head.next;
    }
}
