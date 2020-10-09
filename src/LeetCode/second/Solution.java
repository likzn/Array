package LeetCode.second;

import Array.Array;
import LeetCode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/11/6 19:15
 * @description: 剑指offer
 */
public class Solution {
    //第一题 从左下开始
    public boolean Find(int target, int [][] array) {
        int i = array.length - 1;
        int j = 0;
        while (i >= 0 && j < array[0].length) {
            if (target == array[i][j]) {
                return true;
            }
            if (target > array[i][j]) {
                j++;
                continue;
            }
            if (target < array[i][j]) {
                i--;
                continue;
            }
        }
        return false;
    }
    //第二题 另一种题解:首先遍历第一遍，得出空格的数量，然后从后往前遍历碰到非空格则往后移2*空格数，碰到空格则空格数减一，继续往前遍历
    public static String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (' ' == str.charAt(i)) {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
    //剑指offer第三题题解
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList list = new ArrayList<>();
        ListNode head = reserve(listNode);
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }

    public static ListNode reserve(ListNode listNode) {
        if (listNode==null||listNode.next == null) {
            return listNode;
        }
        ListNode newHead = reserve(listNode.next);
        listNode.next.next = listNode;
        listNode.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        String s = replaceSpace(new StringBuffer("We Are Happy"));
        System.out.println(s);

    }
}
