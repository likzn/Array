package LeetCode.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/9 16:51
 * @description:
 */
public class Leet515 {
    List list = new ArrayList();
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return list;
        }
        ArrayDeque<TreeNode> deque1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> deque2 = new ArrayDeque<>();
        deque1.add(root);
        while (!deque1.isEmpty() || !deque2.isEmpty()) {
            int max = Integer.MIN_VALUE;
            while (!deque1.isEmpty()) {
                TreeNode node = deque1.poll();
                if (max < node.val) {
                    max = node.val;
                }
                if (node.left != null) {
                    deque2.add(node.left);
                }
                if (node.right != null) {
                    deque2.add(node.right);
                }
            }
            list.add(max);
            max = Integer.MIN_VALUE;
            if (deque2.isEmpty()) {
                continue;
            }
            while (!deque2.isEmpty()) {
                TreeNode node = deque2.poll();
                if (max < node.val) {
                    max = node.val;
                }
                if (node.left != null) {
                    deque1.add(node.left);
                }
                if (node.right != null) {
                    deque1.add(node.right);
                }
            }
            list.add(max);

        }
        return list;
    }

}
