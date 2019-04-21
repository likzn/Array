package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/15 14:53
 * @description:
 */
public class link82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(-2);
        dummyHead.next = head;
        ListNode h = dummyHead.next;
        int size = -1;
        while (h != null && h.next != null) {
            if (h.val == h.next.val) {
                h.next = h.next.next;
                size = h.val;
                h = h.next;
            } else if (size == h.val) {
                h.val = h.next.val;
                h.next = h.next.next;
            } else {
                h = h.next;
            }
        }
        return dummyHead.next;
    }


}
