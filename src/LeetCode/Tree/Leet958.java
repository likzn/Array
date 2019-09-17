package LeetCode.Tree;

import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * @author: Li jx
 * @date: 2019/9/7 11:14
 * @description:
 */
public class Leet958 {
    public boolean isCompleteTree(TreeNode root) {
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        boolean flag = false;
        while (!linkedList.isEmpty()) {
            TreeNode treeNode = linkedList.poll();
            if (treeNode == null) {
                flag = true;
                continue;
            }
            if (flag) {
                return false;
            }
            linkedList.add(treeNode.left);
            linkedList.add(treeNode.right);

        }
        return true;
    }
}
