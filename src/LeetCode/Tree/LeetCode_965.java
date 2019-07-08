package LeetCode.Tree;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_965 {
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        return isUnivalTree(root, val);

    }

    public boolean isUnivalTree(TreeNode root, int val) {
        if (root == null) {
            return true;
        }
        if (root.val != val) {
            return false;
        } else {
            return isUnivalTree(root.left, val) && isUnivalTree(root.right, val);
        }

    }
}
