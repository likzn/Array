package LeetCode.Tree;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_543 {
    int max;

    public int diameterOfBinaryTree(TreeNode root) {
        high(root);
        return max;

    }

    public int high(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = high(node.left);
        int right = high(node.right);
        max = Math.max(max, left + right);
        return 1 + Math.max(left, right);
    }

}
