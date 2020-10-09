package LeetCode.剑指offer;

import LeetCode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeMap;

/**
 * @author: Li jx
 * @date: 2019/11/7 19:07
 * @description:
 */
public class Offer3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList list = new ArrayList();
        int layer = 1;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        s1.push(pRoot);
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (layer % 2 == 1) {
                ArrayList list1 = new ArrayList();
                while (!s1.isEmpty()) {
                    TreeNode node = s1.pop();
                    list1.add(node.val);
                    if (node.right != null) {
                        s2.push(node.right);
                    }
                    if (node.left != null) {
                        s2.push(node.left);
                    }
                }
                layer++;
                list.add(list1);
            } else {
                ArrayList list1 = new ArrayList();
                while (!s2.isEmpty()) {
                    TreeNode node = s1.pop();
                    list1.add(node.val);
                    if (node.left != null) {
                        s1.push(node.left);
                    }
                    if (node.right != null) {
                        s1.push(node.right);
                    }

                }
                layer++;
                list.add(list1);

            }
            return list;
        }
        return list;
    }

    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) {
            return false;
        }
        TreeMap<Integer, Integer> map = new TreeMap();
        for (int num : hand) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        while (map.size() > 0) {
            int first = map.firstKey();
            for (int i = first; i < first + W; i++) {
                if (map.get(i) == null) {
                    return false;
                }
                if (map.get(i) == 1) {
                    map.remove(i);
                } else {
                    map.put(i, map.get(i) - 1);
                }
            }
        }
        return true;

    }
}
