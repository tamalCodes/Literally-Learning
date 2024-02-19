public class SwappingNodes {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode left = head, right = head, c = head;

        // go to the left
        for (int i = 0; i < k - 1; i++)
            c = c.next;

        left = c;

        // Now that we have the left pointer where we needed
        // we move the c pointer
        // As soon as the c would touch the last element
        // The right pointer would be at the perfect k-th element

        while (c.next != null) {
            c = c.next;
            right = right.next;
        }

        System.out.println("The value of left is: " + left.val);
        System.out.println("The value of right is: " + right.val);

        // All that is left now is to swap the values
        k = left.val;
        left.val = right.val;
        right.val = k;

        return head;
    }
}
