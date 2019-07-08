package LeetCode.Tree;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_530 {
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int r = min(root.right);
        int l = max(root.left);
        int rootNode = Math.min(Math.abs(r - root.val), Math.abs(l - root.val));
        return Math.min(Math.min(getMinimumDifference(root.right), rootNode), getMinimumDifference(root.left));
    }

    public int min(TreeNode root) {
        if (root.left == null) {
            return root.val;
        }
        return min(root.left);
    }

    public int max(TreeNode root) {
        if (root.right == null) {
            return root.val;
        }
        return max(root.right);
    }

}
