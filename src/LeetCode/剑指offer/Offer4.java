package LeetCode.剑指offer;

import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        int midVal = pre[0];
        int mid = 0;
        TreeNode root = new TreeNode(midVal);
        for (int i = 0; i < in.length; i++) {
            if (midVal == in[i]) {
                mid = i;
            }
        }
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, 1 + mid), Arrays.copyOfRange(in, 0, mid));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, mid + 1, pre.length), Arrays.copyOfRange(in, mid + 1, in.length));
        return root;
    }
}
