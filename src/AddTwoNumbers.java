import java.util.Arrays;

/**
 * Created by Miguel on 5/15/2019.
 */
public class AddTwoNumbers {
    public  static void runListNode() {
        ListNode list1 = new ListNode(2);
        list1.next = null;

        System.out.println(list1.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) { val = x; }
}
