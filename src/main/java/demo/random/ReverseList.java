package demo.random;

/**
 * Created by owen on 2017/9/18.
 */
public class ReverseList {
    class ListNode {
        int val;
        ListNode next;
    }

    public void reverse(ListNode head) {
        ListNode next = null;
        ListNode pre = null;
        ListNode node=head;
        while (node!=null) {
            next=node.next;
            node.next=pre;
            pre=node;
            node=next;
        }
    }
}
