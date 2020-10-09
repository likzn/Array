package LeetCode.second;

import java.util.Collections;

/**
 * @author: Li jx
 * @date: 2019/10/31 14:34
 * @description:
 */
public class Leet543 {
    static int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return result;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftLength = 0;
        int rightLength = 0;
        if (root.left != null) {
            leftLength = dfs(root.left) + 1;
        }
        if (root.right != null) {
            rightLength = dfs(root.right) + 1;
        }
        result = Math.max(rightLength + leftLength, result);
        return Math.max(leftLength, rightLength);

    }
}
