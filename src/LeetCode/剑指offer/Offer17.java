package LeetCode.剑指offer;

import LeetCode.LinkedList.ListNode;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer17 {
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return dfs(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    public static boolean dfs(TreeNode node1, TreeNode node2) {
        if (node2 == null) {
            return true;
        }
        if (node1 == null) {
            return false;
        }
        if (node1.val == node2.val) {
            return dfs(node1.left, node2.left) && dfs(node1.right, node2.right);
        } else {
            return false;
        }
    }
}
