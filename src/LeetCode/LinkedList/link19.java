package LeetCode.LinkedList;

import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/15 14:53
 * @description:
 */
public class link19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        ListNode n1 = dummyHead;
        ListNode n2 = dummyHead;
        while (n-- != 0) {
            n2 = n2.next;
        }
        while (n2.next != null) {
            n1 = n1.next;
            n2 = n2.next;
        }
        n1.next = n1.next.next;
        return head;
    }
}
