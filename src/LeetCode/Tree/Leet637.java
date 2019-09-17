package LeetCode.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/14 11:53
 * @description:
 */
public class Leet637 {
    List<Double> list = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(root);
        double sum;
        while (!arrayDeque.isEmpty()) {
            int size = arrayDeque.size();
            sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = arrayDeque.poll();
                if (node.left != null) {
                    arrayDeque.add(node.left);
                }
                if (node.right != null) {
                    arrayDeque.add(node.right);
                }
                sum += node.val;
            }
            list.add(sum / size);
        }
        return list;

    }
}
