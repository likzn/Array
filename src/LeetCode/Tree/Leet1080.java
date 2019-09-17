package LeetCode.Tree;

/**
 * @author: Li jx
 * @date: 2019/9/14 22:24
 * @description:
 */
public class Leet1080 {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if (dfs(root, limit)) {
            return null;
        }
        return root;
    }

    public boolean dfs(TreeNode root, int limit) {
        if (root.left == null && root.right == null) {
            return limit - root.val > 0;
        }
        boolean lCut = true;
        boolean rCut = true;
        if (root.left != null) {
            lCut = dfs(root.left, limit - root.val);
        }
        if (root.right != null) {
            rCut = dfs(root.right, limit - root.val);
        }
        if (lCut) {
            root.left =null;
        }
        if (rCut) {
            root.right =null;
        }
        return lCut && rCut;
    }


}
