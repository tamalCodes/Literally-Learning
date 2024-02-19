// https://leetcode.com/problems/rotate-list/description/
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

public class RotateList {
    public int getSize(ListNode head) {
        int size = 0;
        ListNode c2 = head;
        while (c2 != null) {
            size++;
            c2 = c2.next;
        }

        return size;
    }

    public ListNode rotateRight(ListNode head, int k) {
        int n = getSize(head);

        if (n == 0 || k == 0 || n == 1 || k % n == 0)
            return head;

        int goTo = k < n ? (n - k) : (n - (k % n));
        System.out.println("The goTo is: " + goTo);

        ListNode c = head, next = null, newhead = null;

        for (int i = 1; i <= n; i++) {
            if (i == goTo) {
                next = c.next;
                newhead = c.next;
                c.next = null;
                c = next;
                continue;
            } else if (i == n) {
                c.next = head;
                head = newhead;
                break;
            }

            c = c.next;

        }

        return head;
    }
}