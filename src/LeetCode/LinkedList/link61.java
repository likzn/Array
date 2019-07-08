package LeetCode.LinkedList;

import java.awt.*;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/15 19:44
 * @description:
 */
public class link61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode h = head;
        ListNode tail = head;
        int size = 1;
        while (tail != null && tail.next != null) {
            tail = tail.next;
            size++;
        }
        k = k % size;
        while (k-- != 0) {
            tail.next = new ListNode(h.val);
            tail = tail.next;
            h = h.next;
        }
        return h;
    }
}
