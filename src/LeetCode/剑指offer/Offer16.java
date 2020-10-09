package LeetCode.剑指offer;

import LeetCode.LinkedList.ListNode;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer16 {
    //非递归
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        ListNode dummyHead = new ListNode(1);
//        ListNode head = dummyHead;
//        while (list1 != null && list2 != null) {
//            if (list1.val <= list2.val) {
//                dummyHead.next = list1;
//                dummyHead = dummyHead.next;
//                list1 = list1.next;
//            } else {
//                dummyHead.next = list2;
//                dummyHead = dummyHead.next;
//                list2 = list2.next;
//            }
//        }
//        if (list1 == null) {
//            dummyHead.next = list2;
//        }
//        if (list2 == null) {
//            dummyHead.next = list1;
//        }
//        return head.next;
//    }
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }

    }
}
