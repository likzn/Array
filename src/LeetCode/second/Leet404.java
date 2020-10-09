package LeetCode.second;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author: Li jx
 * @date: 2019/11/7 19:44
 * @description:
 */
public class Leet404 {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.left.left == null && root.left.right == null) {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + root.left.val;
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

}
