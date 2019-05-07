package LeetCode.Tree;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_513 {
    int num = -1;
    int depth = -1;
    public int findBottomLeftValue(TreeNode root) {
        findBottomLeftValue(root, 0);
        return num;
    }

    public void findBottomLeftValue(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (this.depth > depth) {
            num = root.val;
            this.depth = depth;
        }
        findBottomLeftValue(root.left, depth + 1);
        findBottomLeftValue(root.right, depth + 1);

    }
}
