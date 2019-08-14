public class AddTwoNumbers {
    public static void runAddTwoNumbers() {
        ListNode node1 = new ListNode(9);

        node1.next = null;

        ListNode node2 = new ListNode(1);

        node2.next = new ListNode(9);

        node2.next.next = new ListNode(9);
        node2.next.next.next = new ListNode(9);
        node2.next.next.next.next = new ListNode(9);
        node2.next.next.next.next.next = new ListNode(9);
        node2.next.next.next.next.next.next = new ListNode(9);
        node2.next.next.next.next.next.next.next = new ListNode(9);
        node2.next.next.next.next.next.next.next.next = new ListNode(9);
        node2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        node2.next.next.next.next.next.next.next.next.next.next = null;

        ListNode result = addTwoNumbers(node1, node2);

        while (result != null) {
            System.out.print(result.val);
            result = result.next;
            if(result != null) {
                System.out.print(" -> ");
            }
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) { val = x; }
}
