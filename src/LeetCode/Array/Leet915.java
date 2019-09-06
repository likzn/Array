package LeetCode.Array;

import LeetCode.LinkedList.ListNode;

/**
 * @author: Li jx
 * @date: 2019/8/9 15:54
 * @description:
 */
public class Leet915 {
    public int partitionDisjoint(int[] A) {
        int index = 0;
        int leftMax = A[0];
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            max = Math.max(A[i], max);
            if (A[i] < leftMax) {
                leftMax = max;
                index = i;
            }
        }
        return index + 1;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode node = null;
        while (l1!= null && l2 != null) {
            if (l1.val <= l2.val) {
                node = l1;
                node.next = mergeTwoLists(l1.next, l2);
            } else {
                node = l2;
                node.next = mergeTwoLists(l1, l2.next);
            }
        }
        return node;
    }
}
