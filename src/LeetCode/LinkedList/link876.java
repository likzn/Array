package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/13 22:13
 * @description:
 */
public class link876 {
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        size = size / 2;
        for (int i = 0; i < size; i++) {
            head = head.next;
        }
        return head;
    }
}
