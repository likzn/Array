package LeetCode.剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList list = new ArrayList();
        if (root == null) {
            return list;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        while (!linkedList.isEmpty()) {
            int size = linkedList.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = linkedList.pollFirst();
                list.add(node.val);
                if (node.left != null) {
                    linkedList.addLast(node.left);
                }
                if (node.right != null) {
                    linkedList.addLast(node.right);
                }
            }
        }
        return list;
    }
}
