package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/15 14:53
 * @description:
 */
public class link86 {
    public ListNode partition(ListNode head, int x) {
        ListNode h = head;
        List<Integer> list = new ArrayList();
        List<Integer> list1 = new ArrayList<>();
        while (h != null) {
            int s = h.val;
            if (s < x) {
                list.add(s);
            } else {
                list1.add(s);
            }
            h = h.next;
        }
        h = head;
        for (int i = 0; i < list.size(); i++) {
            h.val = list.get(i);
            h = h.next;
        }
        for (int i = 0; i < list1.size(); i++) {
            h.val = list1.get(i);
            h = h.next;
        }
        return head;
    }
}
