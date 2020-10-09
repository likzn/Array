package LeetCode.second;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: Li jx
 * @date: 2019/10/31 15:01
 * @description:
 */
public class Leet144 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();
            list.add(treeNode.val);
            if (treeNode.right != null) {
                stack.add(treeNode.right);
            }
            if (treeNode.left != null) {
                stack.add(treeNode.left);
            }
        }
        return list;
    }

}
