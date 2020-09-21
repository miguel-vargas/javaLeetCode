package Easy;

import Utility.ListNode;

public class ReverseList {
    public static void run() {
        ReverseList runner = new ReverseList();

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        printLL(node);

        ListNode reversed = runner.reverseList(node);

        printLL(reversed);
    }

    public ListNode reverseList(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode newNode = reverseList(node.next);

        node.next.next = node;
        node.next = null;

        return newNode;
    }

    public ListNode reverseListIterative(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }

    public static void printLL(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }

        System.out.println();
    }
}
