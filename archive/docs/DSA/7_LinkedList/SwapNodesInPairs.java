// https://leetcode.com/problems/swap-nodes-in-pairs/

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode c = head, p = head;
        boolean isFirst = true;

        while (c != null) {
            ListNode x = c.next;

            if (c.next == null)
                return head;

            c.next = c.next.next;
            x.next = c;

            if (isFirst) {
                head = x;
                isFirst = false;
            } else {
                p.next = x;
                p = c;
            }

            c = c.next;
        }

        return head;

    }
}
