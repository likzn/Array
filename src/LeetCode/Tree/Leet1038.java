package LeetCode.Tree;

/**
 * @author: Li jx
 * @date: 2019/9/14 10:41
 * @description:
 */
public class Leet1038 {
    int lastSum = 0;

    public TreeNode bstToGst(TreeNode root) {
        dfs(root);
        return root;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        lastSum += root.val;
        root.val = lastSum;
        dfs(root.left);
    }
}
