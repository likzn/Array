package LeetCode.Tree;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author: Li jx
 * @date: 2019/7/25 10:53
 * @description:
 */
public class Leetcode_230 {
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = count(root.left);
        if (leftCount + 1 == k) {
            return root.val;
        }
        if (leftCount >= k) {
            return kthSmallest(root.left, k);
        }
        return kthSmallest(root.right, k - leftCount - 1);

    }

    private int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return count(root.left) + count(root.right) + 1;
    }

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(100);
        BigDecimal b = new BigDecimal(120);
        System.out.println(a.divide(b,2,RoundingMode.HALF_UP));
    }
}
