package LeetCode.LinkedList;

import java.util.Stack;

/**
 * @auther: Li jx
 * @date: 2019/4/12 16:17
 * @description:
 */
public class link234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack();
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        cur = head;
        for (int i = 0; i < size / 2; i++) {
            stack.push(cur.val);
            cur = cur.next;
        }
        if (size % 2 == 1) {
            cur = cur.next;
        }
        while (cur != null) {
            if (cur.val == stack.pop()) {
                cur = cur.next;
                continue;
            }
            return false;

        }
        return true;
    }

}
