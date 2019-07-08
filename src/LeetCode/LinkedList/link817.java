package LeetCode.LinkedList;

import java.util.HashSet;

/**
 * @auther: Li jx
 * @date: 2019/4/15 14:53
 * @description:
 */
public class link817 {
    public int numComponents(ListNode head, int[] G) {
        int count = 0;
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < G.length; i++) {
            set.add(G[i]);
        }
        while (head != null) {
            if (set.contains(head.val)) {
                if (head.next == null || !set.contains(head.next.val)) {
                    count++;
                }
            }
            head = head.next;
        }
        return count;
    }
}
