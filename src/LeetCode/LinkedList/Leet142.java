package LeetCode.LinkedList;

/**
 * @author: Li jx
 * @date: 2019/9/11 17:00
 * @description:
 */
public class Leet142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            if (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (slow == fast) {
                    break;
                }
            } else {
                return null;
            }
        }
        ListNode node = head;
        while (true) {
            if (node == slow) {
                return slow;
            }
            node = node.next;
            slow = slow.next;
        }
    }
}
