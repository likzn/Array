package LeetCode.Tree;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for (int i = 0; i < preorder.length; i++) {
            root = add(root, preorder[i]);
        }
        return root;
    }

    public TreeNode add(TreeNode root, int num) {
        if (root == null) {
            return new TreeNode(num);
        }
        if (root.val > num) {
            root.left=add(root.left, num);
        } else {
            root.right = add(root.right, num);
        }
        return root;
    }
}
