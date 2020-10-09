package LeetCode.剑指offer;


/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer26 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode head = pHead;
        while (head != null) {
            RandomListNode node = new RandomListNode(head.label);
            RandomListNode node1 = head.next;
            head.next = node;
            node.next = node1;
            head = node1;
        }
        head = pHead;
        while (head != null) {
            head.next.random = head.random == null ? null : head.random.next;
            head = head.next.next;
        }
        head = pHead;
        RandomListNode node = head.next;
        while (head != null) {
            RandomListNode node1 = head.next;
            head.next = node1.next;
            node1.next = node1.next == null ? null : node1.next.next;
            head = head.next;
        }
        return node;
    }
}
