package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/8/12 17:09
 * @description:
 */
public class Leet124 {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getMax(root);
        return max;
    }
    public int getMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, getMax(root.left));
        int right = Math.max(0, getMax(root.right));
        max = Math.max(max, left + right + root.val);

        return Math.max(left, right) + root.val;
    }
}
