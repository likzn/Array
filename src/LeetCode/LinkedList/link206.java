package LeetCode.LinkedList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * @auther: Li jx
 * @date: 2019/4/12 15:41
 * @description:
 */
public class link206 {
//    public ListNode reverseList(ListNode head) {
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null) {
//            ListNode listNode = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = listNode;
//        }
//        return pre;
//    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;
    }
}
