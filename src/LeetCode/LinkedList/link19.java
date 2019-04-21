package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/15 14:53
 * @description:
 */
public class link19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node1 = head;
        ListNode node2 = head;
        while (n-- != 0) {
            node1 = node1.next;
        }
        while (node1.next.next != null) {
            node2 = node2.next;
            node1 = node1.next;
        }
        node2.next = node2.next.next;

        return head;

    }
}
