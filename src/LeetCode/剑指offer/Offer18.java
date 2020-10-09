package LeetCode.剑指offer;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer18 {
    public static void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        Mirror(root.left);
        Mirror(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;

    }
}
