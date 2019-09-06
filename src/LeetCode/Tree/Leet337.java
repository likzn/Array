package LeetCode.Tree;

/**
 * @author: Li jx
 * @date: 2019/8/14 16:36
 * @description:
 */
public class Leet337 {
    public int rob(TreeNode root) {
        return robRoot(root);
    }
    public int robRoot(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int rob = root.val;
        if (root.left != null) {
            rob += robRoot(root.left.left) + robRoot(root.left.right);
        }
        if (root.right != null) {
            rob += robRoot(root.right.left) + robRoot(root.right.right);
        }
        int notRob = robRoot(root.right) + robRoot(root.left);
        return Math.max(rob, notRob);
    }
}
