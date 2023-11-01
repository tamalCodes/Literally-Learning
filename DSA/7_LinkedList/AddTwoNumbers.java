public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1, c2 = l2;
        int a = 0, b = 0, carry = 0, sum = 0, valueToBeAdded = 0;

        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        while (c1 != null || c2 != null || carry > 0) {

            a = c1 == null ? 0 : c1.val;
            b = c2 == null ? 0 : c2.val;

            sum = a + b;

            if (carry > 0) {
                sum += carry;
                carry = carry / 10;
            }

            if (sum > 9) {
                valueToBeAdded = sum % 10;
                carry = sum / 10;
            } else {
                valueToBeAdded = sum;
            }

            current.next = new ListNode(valueToBeAdded);
            current = current.next;

            sum = 0;

            if (c1 != null)
                c1 = c1.next;

            if (c2 != null)
                c2 = c2.next;
        }

        return dummyHead.next;
    }
}
