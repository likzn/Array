package LeetCode.second;

import LeetCode.LinkedList.ListNode;

/**
 * @author: Li jx
 * @date: 2019/10/31 14:34
 * @description:
 */
public class Leet61 {
    public ListNode rotateRight(ListNode head, int k) {
        //鲁棒性检查
        if (head == null || k == 0) {
            return head;
        }
        //得到链表总长度
        ListNode h1 = head;
        int count = 1;
        while (h1.next != null) {
            count++;
            h1 = h1.next;
        }
        //使得头尾相连
        h1.next = head;
        //得到循环后头结点的前节点
        count = count - k % count - 1;
        while (count != 0) {
            head = head.next;
            count--;
        }
        //res为答案
        ListNode res = head.next;
        //使得两者断开
        head.next = null;
        return res;
    }
}
