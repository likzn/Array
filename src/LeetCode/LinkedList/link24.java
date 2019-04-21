package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/15 14:53
 * @description:
 */
public class link24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode h = head.next;
        head.next = swapPairs(h.next);
        h.next = head;
        return h;

    }
}
