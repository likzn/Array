package LeetCode.Tree;

/**
 * @author: Li jx
 * @date: 2019/9/7 19:30
 * @description:
 */
public class Leet106 {
    static int rightIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        rightIndex = postorder.length - 1;
        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }
        return buildTree(inorder, postorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[rightIndex--]);
        int index = 0;
        for (int i = left; i <= right; i++) {
            if (inorder[i] == root.val) {
                index = i;
            }
        }
        root.right = buildTree(inorder, postorder, index + 1, right);
        root.left = buildTree(inorder, postorder, left, index - 1);
        return root;
    }
}
