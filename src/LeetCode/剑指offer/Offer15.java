package LeetCode.剑指offer;

import LeetCode.LinkedList.ListNode;
import com.sun.org.apache.bcel.internal.generic.POP2;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer15 {
    //递归
//    public static ListNode ReverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode newHead = ReverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
