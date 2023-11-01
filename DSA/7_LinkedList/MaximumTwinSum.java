public class MaximumTwinSum {
    public int getSize(ListNode head) {
        int size = 0;
        ListNode c2 = head;
        while (c2 != null) {
            size++;
            c2 = c2.next;
        }

        return size;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public int pairSum(ListNode head) {
        int max = 0;
        int n = getSize(head), n1 = getSize(head);
        ListNode c1 = head, c2 = head;

        int mid = n1 / 2;

        for (int i = 0; i < mid - 1; i++)
            c2 = c2.next;

        ListNode temp = c2.next;
        c2.next = null;
        c2 = temp;

        c2 = reverseList(c2);

        while (c1 != null && c2 != null) {
            max = Math.max(max, c1.val + c2.val);
            c1 = c1.next;
            c2 = c2.next;
        }

        return max;
    }
}
