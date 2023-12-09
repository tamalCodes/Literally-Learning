public class PalindromeLinkedList {
    public int getSize(ListNode head) {
        int size = 0;
        ListNode c2 = head;

        while (c2 != null) {
            size++;
            c2 = c2.next;
        }

        return size;
    }

    public boolean isPalindrome(ListNode head) {
        int n = getSize(head);
        int n1 = n;
        int midIndex = n / 2 - 1;

        // Traverse to the mid
        ListNode c1 = head;

        for (int i = 0; i <= midIndex; i++) {
            if (i == midIndex) {
                ListNode temp = c1.next;
                c1.next = null;
                c1 = temp;
            } else {
                c1 = c1.next;
            }
        }

        if (n1 % 2 != 0)
            c1 = c1.next;

        // My new head
        ListNode c2 = c1, next = null, prev = null;

        // Reverse the second half of the LL
        while (c2 != null) {
            next = c2.next;
            c2.next = prev;
            prev = c2;
            c2 = next;
        }

        // Now that the reversal is done we need to compare
        // We also have to reinitialize the head of the second part

        c2 = prev;
        c1 = head;

        while (c1 != null && c2 != null) {
            if (c1.val != c2.val)
                return false;

            c1 = c1.next;
            c2 = c2.next;
        }

        return true;
    }
}
