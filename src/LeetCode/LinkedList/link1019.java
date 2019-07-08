package LeetCode.LinkedList;

import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * @auther: Li jx
 * @date: 2019/4/11 21:37
 * @description:
 */
public class link1019 {
    public int[] nextLargerNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        HashMap<ListNode, Integer> hashMap = new HashMap();
        int i = 0;
        ListNode h = head;
        while (h != null) {
            while (!stack.isEmpty() && stack.peek().val < h.val) {
                hashMap.put(stack.pop(), h.val);
            }
            stack.push(h);
            h = h.next;
            i++;
        }
        int[] ints = new int[i];
        for (int j = 0; j < i; j++) {
            ints[j] = hashMap.getOrDefault(head, 0);
            head = head.next;
        }
        return ints;
    }
}
