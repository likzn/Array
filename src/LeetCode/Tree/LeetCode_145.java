package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @auther: Li jx
 * @date: 2019/7/19 09:05
 * @description:
 */
public class LeetCode_145 {
    //    递归算法
//    List<Integer> list = new ArrayList<>();
//    public List<Integer> postorderTraversal(TreeNode root) {
//        post(root);
//        return list;
//    }
//
//    public void post(TreeNode treeNode) {
//        if (treeNode == null) {
//            return;
//        }
//        post(treeNode.left);
//        post(treeNode.right);
//        list.add(treeNode.val);
//    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.right;
            }
            if(!stack.isEmpty()) {
                TreeNode treeNode = stack.pop();
                list.add(treeNode.val);
                root = treeNode.left;
            }
        }
        return list;
    }
}
