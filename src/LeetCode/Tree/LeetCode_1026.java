package LeetCode.Tree;

import javafx.scene.transform.Rotate;
import sun.reflect.generics.tree.Tree;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_1026 {
    public int maxAncestorDiff(TreeNode root) {
        Tree tree = max(root);
        return tree.s;
    }

    public Tree max(TreeNode root) {
        if (root == null) {
            return null;
        }
        Tree left = max(root.left);
        Tree right = max(root.right);
        int leftMin = left != null ? left.min : root.val;
        int leftMax = left != null ? left.max : root.val;
        int rightMin = right != null ? right.min : root.val;
        int rightMax = right != null ? right.max : root.val;
        int leftS = left != null ? left.s : 0;
        int rightS = right != null ? right.s : 0;
        int min = Math.min(leftMin, rightMin);
        int max = Math.max(leftMax , rightMax);
        int s = Math.abs(root.val - min)- Math.abs(root.val - max)>0?Math.abs(root.val - min):Math.abs(root.val - max);
        s = Math.max(s, leftS);
        s = Math.max(s, rightS);
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        return new Tree(min, max, s);
    }

    class Tree {
        int min;
        int max;
        int s;
        public Tree(int min, int max, int s) {
            this.min = min;
            this.max = max;
            this.s = s;
        }
    }
}
