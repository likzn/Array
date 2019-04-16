package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/13 09:45
 * @description:
 */

public class link247 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
