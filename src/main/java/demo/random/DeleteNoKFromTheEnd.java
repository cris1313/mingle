package demo.random;

/**
 * Created by owen on 2017/9/17.
 */
public class DeleteNoKFromTheEnd {
    class SimpleListNode {
        int val;
        SimpleListNode next;

    }

    class DoubleListNode {
        int val;
        DoubleListNode pre;
        DoubleListNode next;
    }

    public void deleteSimple(SimpleListNode head, int k) {
        if (head == null || k < 1) return;
        SimpleListNode front, back, back2;
        front = head;
        back = null;
        back2 = null;
        int count = 0;
        while (front != null) {

            if (count == k)
                back = head;
            front = front.next;
            if (back != null) {
                back = back.next;
                back2 = back;
            }
            count++;
        }
        if (count == k) {
        }//删除头结点
        else if (count < k) return;
        else {
            back2.next = back.next;
        }

    }
}
