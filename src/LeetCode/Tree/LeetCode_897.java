package LeetCode.Tree;

import LeetCode.LinkedList.ListNode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_897 {
    List<Integer> list = new ArrayList();
    public TreeNode increasingBST(TreeNode root) {
        order(root);
        TreeNode treeNode = new TreeNode(list.get(0));
        TreeNode head = treeNode;
        for (int i = 1; i < list.size(); i++) {
            head.right = new TreeNode(list.get(i));
            head = head.right;
        }
        return treeNode;
    }

    public void order(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        order(treeNode.left);
        list.add(treeNode.val);
        order(treeNode.right);
    }
}
