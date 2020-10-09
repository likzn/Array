package LeetCode.Tree;


/**
 * @author: Li jx
 * @date: 2019/9/10 18:47
 * @description:
 */
public class Leet687 {
    int res = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftMax = dfs(node.left);
        int rightMax = dfs(node.right);
        int left = 0;
        int right = 0;
        if (node.left != null && node.left.val == node.val) {
            left += leftMax + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            right += rightMax + 1;
        }

        res = Math.max(res, left + right );
        return Math.max(left, right);
    }



}
