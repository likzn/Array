package LeetCode.LinkedList;

/**
 * @author: Li jx
 * @date: 2019/7/30 11:32
 * @description:
 */
public class Leet328 {
    public ListNode oddEvenList(ListNode head) {
        int i = 0;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyHead = head;
        ListNode second = head.next;
        ListNode temp = head;
        while (temp.next.next != null) {
            i++;
            temp = dummyHead.next;
//            dummyHead = temp;
            dummyHead.next = dummyHead.next.next;
            dummyHead = temp;
        }
        if (i % 2 == 1) {
            dummyHead = temp.next;
            temp.next = null;
            dummyHead.next = second;

        } else {

            temp.next = second;
        }
        return head;
    }
}
