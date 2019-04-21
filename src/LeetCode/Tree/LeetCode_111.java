package LeetCode.Tree;


/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if ((root.left == null && root.right != null)||(root.right == null && root.left != null)) {
            return 1;
        }
        return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
    }

}
