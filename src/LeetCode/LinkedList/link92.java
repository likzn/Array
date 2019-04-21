package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/15 19:44
 * @description:
 */
public class link92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(0);
        ListNode listNode = dummyHead;

        List<Integer> list = new ArrayList();
        dummyHead.next = head;
        int a = m;
        while (a-- != 0) {
            dummyHead = dummyHead.next;
        }
        for (int i = 0; i < n - m; i++) {
            list.add(dummyHead.val);
            dummyHead = dummyHead.next;
        }
        dummyHead = listNode;
        a = m;
        while (a-- != 0) {
            dummyHead = dummyHead.next;
        }
        for (int i = 0; i < n - m; i++) {
            dummyHead.val = list.get(list.size() - 1 - i);
            dummyHead = dummyHead.next;
        }
        return head;





    }

}
