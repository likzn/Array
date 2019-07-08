package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/12 15:31
 * @description:
 */
public class link160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;
        ListNode a = headA;
        ListNode b = headB;
        while (a != null) {
            sizeA++;
            a = a.next;
        }
        while (b != null) {
            sizeB++;
            b = b.next;
        }
        a = headA;
        b = headB;
        if (sizeA > sizeB) {
            for (int i = 0; i < sizeA - sizeB; i++) {
                a = a.next;
            }
        } else {
            for (int i = 0; i < sizeB - sizeA; i++) {
                b = b.next;
            }
        }
        while (a != null) {
            if (a == b) {
                return a;
            }
            a = a.next;
            b = b.next;
        }
        return null;
    }
}
