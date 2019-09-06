package LeetCode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: Li jx
 * @date: 2019/8/6 17:01
 * @description:
 */
public class Lee199 {
    public List<Integer> rightSideView(TreeNode root) {
        List list = new ArrayList();
        if (root == null) {
            return list;
        }
        boolean i = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- != 0) {
                TreeNode node = queue.poll();
                if (i) {

                list.add(node.val);
                    i = false;
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
            }
            i = true;
        }
        return list;
    }
}
