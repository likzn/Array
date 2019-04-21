package LeetCode.Tree;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_104 {

    public int maxDepth(TreeNode root) {
        int size = 0;
        return maxDepth(root, size + 1);
    }

    public int maxDepth(TreeNode root, int size) {
        if (root == null) {
            return size - 1;
        } else {
            int a = maxDepth(root.left, size + 1);
            int b = maxDepth(root.right, size + 1);
            return a > b ? a : b;
        }
    }
}
