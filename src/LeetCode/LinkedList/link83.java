package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/12 14:24
 * @description:
 */
public class link83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        if (cur == null) {
            return head;
        }
        while (cur.next!= null) {
            if (cur.val == cur.next.val     ) {
                cur.next = cur.next.next;
                continue;
            }
            cur = cur.next;
        }
        return head;
    }
}
