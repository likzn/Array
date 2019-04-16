package LeetCode.LinkedList;

import org.w3c.dom.NodeList;

/**
 * @auther: Li jx
 * @date: 2019/4/11 20:54
 * @description:
 */
public class link23 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode head = dummyHead;
        while (l1!= null && l2!= null) {
            if (l1.val < l2.val) {
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            } else if (l1.val > l2.val) {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
        }
        if (l1 == null) {
            head.next = l2;
        }
        if (l2 == null) {
            head.next = l1;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(4);
        mergeTwoLists(listNode1, listNode);
    }
}
