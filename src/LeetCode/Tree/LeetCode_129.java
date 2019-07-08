package LeetCode.Tree;

import javafx.scene.transform.Rotate;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_129 {
    int res = 0;

    public int sumNumbers(TreeNode root) {
        sumNumbers(root, 0);
        return res;
    }

    public void sumNumbers(TreeNode root, int i) {
        if (root != null) {
            if (root.right == null && root.left == null) {
                res = res + i * 10 + root.val;
            } else {
                sumNumbers(root.left, i * 10 + root.val);
                sumNumbers(root.right, i * 10 + root.val);
            }
        }
    }
}
