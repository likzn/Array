package LeetCode.LinkedList;

import javafx.scene.shape.Circle;

/**
 * @auther: Li jx
 * @date: 2019/4/11 20:53
 * @description:
 */
public class ListNode {
    public int val;
    public ListNode next;


    public ListNode(int x) {
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
        int[] ints = new int[]{1, 2, 2, 2, 3};
        ListNode l = set(ints);
        new link82().deleteDuplicates(l);
    }
}
