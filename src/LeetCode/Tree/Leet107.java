package LeetCode.Tree;



import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/10/22 19:36
 * @description:
 */
public class Leet107 {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return lists;
        }
        ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(root);
        while (!arrayDeque.isEmpty()) {
            int size = arrayDeque.size();
            List list = new ArrayList();
            for (int i = 0; i < size; i++) {
                TreeNode node = arrayDeque.poll();
                list.add(node.val);
                if (node.left != null) {
                    arrayDeque.add(node.left);
                }
                if (node.right != null) {
                    arrayDeque.add(node.right);
                }
            }
            lists.add(0, list);
        }
        return lists;
    }
}
