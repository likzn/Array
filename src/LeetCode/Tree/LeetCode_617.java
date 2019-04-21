package LeetCode.Tree;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 != null) {
            return t2;
        } else if (t2 == null && t1 != null) {
            return t1;
        } else if (t1 != null && t2 != null) {
            TreeNode left = mergeTrees(t1.left, t2.left);
            TreeNode right = mergeTrees(t1.right, t2.right);
            t1.left = left;
            t1.right = right;
            t1.val = t1.val + t2.val;
            return t1;
        }
        return null;

    }
}
