public class ReOrderList {
    public int getSize(ListNode head) {
        int size = 0; // Initialize size to 0
        ListNode c2 = head; // Start from the head of the list

        while (c2 != null) {
            size++; // Increment the size for each node visited
            c2 = c2.next; // Move to the next node
        }

        return size;
    }

    public void reorderList(ListNode head) {
        // Calculate the size
        int n = getSize(head);
        if (n == 1 || n == 2)
            return;

        int n1 = n;
        int mid = n % 2 == 0 ? ((n / 2) + 1) : (n / 2);

        ListNode c1 = head;
        ListNode c2 = head;
        ListNode next = null;
        ListNode next2 = null;
        // traverse to the mid

        for (int i = 0; i < mid; i++) {
            if (i == mid - 1) {

                if (n1 % 2 != 0)
                    c2 = c2.next;

                next = c2.next;
                c2.next = null;
                c2 = next;
            } else {
                c2 = c2.next;
            }
        }

        ListNode prev = null;
        next = null;

        while (c2 != null) {
            next = c2.next;
            c2.next = prev;
            prev = c2;
            c2 = next;
        }

        // New head of revresed LL is prev
        c2 = prev;
        ListNode temp = null;

        while (c2 != null) {
            next = c1.next;
            temp = c2.next;

            c1.next = c2;

            if (next != null)
                c2.next = next;

            c1 = next;
            c2 = temp;
        }

        if (c1 != null)
            c1 = c1.next;

        while (c1 != null)
            c1 = c1.next;

    }
}
