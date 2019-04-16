package LeetCode.LinkedList;

import javafx.scene.shape.Circle;

/**
 * @auther: Li jx
 * @date: 2019/4/11 20:53
 * @description:
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode set(int[] ints) {
        ListNode head = new ListNode(ints[0]);
        ListNode cur = head;
        for (int i = 1; i < ints.length; i++) {
            cur.next = new ListNode(ints[i]);
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3};
        ListNode l = set(ints);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }
}
