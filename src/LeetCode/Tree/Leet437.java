package LeetCode.Tree;

/**
 * @author: Li jx
 * @date: 2019/9/13 17:34
 * @description:
 */
public class Leet437 {
    private int sumNum = 0;
    public int pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return sumNum;
    }

    public void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        if (sum == root.val) {
            sumNum++;
        }
        if (sum < root.val) {
            return;
        }
        dfs(root.left, sum - root.val);
        dfs(root.right, sum - root.val);


    }
}
