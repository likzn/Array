package LeetCode.Tree;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author: Li jx
 * @date: 2019/9/11 15:50
 * @description:
 */
public class Leet662 {
    int max = Integer.MIN_VALUE;
    public int widthOfBinaryTree(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int length = node.val;
                if (node.left != null) {
                    node.left.val = length * 2 - 1;
                    queue.add(node.left);
                }
                if (node.right != null) {
                    node.right.val = length * 2 ;
                    queue.add(node.right);
                }
            }
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int left = Integer.MIN_VALUE;
            int right = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (i == 0) {
                    left = node.val;
                }
                if ( i == size - 1) {
                    right = node.val;
                }
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
