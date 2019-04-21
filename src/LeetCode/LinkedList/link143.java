package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/15 14:53
 * @description:
 */
public class link143 {

    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode tail = reserve(slow);
        ListNode h = head;
        while (h != slow) {
            ListNode node = h;
            ListNode node1 = tail;
            h = h.next;
            tail = tail.next;
            node.next = node1;
            node1.next = h;
        }
    }

    public ListNode reserve(ListNode root) {
        if (root == null || root.next == null) {

            return root;
        }
        ListNode listNode = reserve(root.next);
        root.next.next = root;
        root.next = null;
        return listNode;
    }
}
