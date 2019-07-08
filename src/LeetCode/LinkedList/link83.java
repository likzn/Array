package LeetCode.LinkedList;

import java.lang.management.BufferPoolMXBean;

/**
 * @auther: Li jx
 * @date: 2019/4/12 14:24
 * @description:
 */
public class link83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if (head.next.val == head.val) {
            head = head.next;

        }
        return head;
    }
}
