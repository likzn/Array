package LeetCode.剑指offer;

import LeetCode.LinkedList.ListNode;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer14 {

    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        while (k != 0) {
            if (second == null) {
                return null;
            }
            second = second.next;
            k--;
        }
        while (second != null) {
            second = second.next;
            first = first.next;
        }
        return first;
    }
}
