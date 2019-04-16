package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/15 14:53
 * @description:
 */
public class link2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = 0, b = 0;
        int next = 0;
        int sum;
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null || l2 != null) {
            a = l1 != null ? l1.val : 0;
            b = l2 != null ? l2.val : 0;
            sum = a + b + next;
            next = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (next == 1) {
            dummyHead.next = new ListNode(1);
        }
        return dummyHead.next;
    }
}
