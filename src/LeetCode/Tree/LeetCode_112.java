package LeetCode.Tree;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        return root == null ? false : hasPathSum(root, sum, 0);
    }

    public boolean hasPathSum(TreeNode root, int sum, int pre) {
        if (root == null) {
            return false;
        }
        if (root.val + pre == sum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, sum, pre + root.val) || hasPathSum(root.right, sum, pre + root.val);

    }
}
