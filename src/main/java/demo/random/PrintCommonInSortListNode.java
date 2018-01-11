package demo.random;

/**
 * Created by owen on 2017/9/17.
 */
public class PrintCommonInSortListNode {
    class ListNode {
        int val;
        ListNode next;
    }

    public static void main(String[] args) {

    }

    public void print(ListNode head1, ListNode head2) {
        ListNode p1, p2;
        p1 = head1;
        p2 = head2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p1 = p1.next;
            } else if (p1.val > p2.val)
                p2 = p2.next;
            else {
                System.out.println(p1.val);
                p1 = p1.next;
                p2 = p2.next;
            }
        }
    }

}
