package LeetCode.Tree;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return root;
        }
        if (root.val == val) {
            return root;
        }
        TreeNode node = searchBST(root.left, val);
        TreeNode node1 = searchBST(root.right, val);
        return node != null ? node : node1;
    }
}
