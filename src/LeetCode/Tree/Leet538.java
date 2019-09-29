package LeetCode.Tree;

/**
 * @author: Li jx
 * @date: 2019/9/19 15:59
 * @description:
 */
public class Leet538 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        int a = root.val;
        root.val += sum;
        sum += a;

        dfs(root.left);

    }
}
