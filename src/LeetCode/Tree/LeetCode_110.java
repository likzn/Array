package LeetCode.Tree;


/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_110 {

    public boolean isBalanced(TreeNode root) {
        return is(root).isTree;
    }

    public Node is(TreeNode root) {
        if (root == null) {
            return new Node(true, 0);
        }
        Node left = is(root.left);
        Node right = is(root.right);
        if (Math.abs(left.depth - right.depth) <= 1 && left.isTree == true && right.isTree == true) {
            return new Node(true, Math.max(left.depth, right.depth)+1);
        }
        return new Node(false, 0);
    }

    class Node {
        boolean isTree;
        int depth;

        Node(boolean isTree, int depth) {
            this.depth = depth;
            this.isTree = isTree;
        }
    }

}
