package LeetCode.Tree;

import java.util.Stack;

/**
 * @author: Li jx
 * @date: 2019/8/28 16:27
 * @description:
 */
public class Leet1161 {
    public int maxLevelSum(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        int max = Integer.MIN_VALUE;
        int floor = 0;
        int curFloor = 0;
        stack1.add(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int currentSum = 0;
            curFloor++;
            while (!stack1.isEmpty()) {
                TreeNode treeNode = stack1.pop();
                if (treeNode.left != null) {
                    stack2.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    stack2.add(treeNode.right);
                }
                currentSum += treeNode.val;
            }
            if (currentSum > max) {
                max = currentSum;
                floor = curFloor;
            }
            currentSum = 0;
            curFloor++;
            while (!stack2.isEmpty()) {

                TreeNode treeNode = stack2.pop();
                if (treeNode.left != null) {
                    stack1.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    stack1.add(treeNode.right);
                }
                currentSum += treeNode.val;
            }
            if (currentSum > max) {
                max = currentSum;
                floor = curFloor;
            }
        }
        return floor;
    }
}
