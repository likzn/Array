package LeetCode.Tree;

/**
 * @author: Li jx
 * @date: 2019/7/30 14:00
 * @description:
 */
public class Leet222 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lt = getDepth(root.left);
        int rt = getDepth(root.right);
        if (lt == rt) {
            return (1 << lt) + countNodes(root.right);
        } else {
            return (1 << rt) + countNodes(root.left);
        }
    }

    public int getDepth(TreeNode node) {
        int dep = 0;
        while (node != null) {
            dep++;
            node = node.left;
        }
        return dep;
    }
}
