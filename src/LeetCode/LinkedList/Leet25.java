package LeetCode.LinkedList;

/**
 * @author: Li jx
 * @date: 2019/8/16 17:32
 * @description:
 */
public class Leet25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode h = head;
        for (int i = 1; i < k && h != null; i++) {
            h = h.next;
        }
        if (h == null) {
            return head;
        }
        ListNode h2 = h.next;
        h.next = null;
        ListNode first = reverse(head);
        h = reverseKGroup(h2, k);
        head.next = h;
        return first;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode listNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;
    }
}
