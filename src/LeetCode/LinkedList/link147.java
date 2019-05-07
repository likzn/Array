package LeetCode.LinkedList;

import com.sun.org.apache.bcel.internal.generic.DDIV;

/**
 * @auther: Li jx
 * @date: 2019/4/11 20:54
 * @description:
 */
public class link147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummyHead = new ListNode(Integer.MAX_VALUE);
        dummyHead.next = head;
        return add(dummyHead, dummyHead.next).next;
    }

    public ListNode add(ListNode head, ListNode addNum) {
        if (addNum == null) {
            return addNum;
        }
        ListNode node = head;
        ListNode addNumNext = addNum.next;
        while (node.next != null) {
            if (node.next.val >= addNum.val) {
                ListNode listNode = node.next;
                node.next = addNum;
                addNum.next = listNode;
                break;
            } else {
                node = node.next;
            }
        }
        add(head, addNumNext);
        return head;

    }
}
