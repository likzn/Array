package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/12 15:08
 * @description:
 */
public class link141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (slow == null || slow.next == null) {
            return false;
        }
        while (fast != null) {
            for (int i = 0; i < 2; i++) {
                fast = fast.next;
                if (fast.next == null) {
                    return false;
                }
            }
            slow.next = slow.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;

    }
}
