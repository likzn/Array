package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/10 19:29
 * @description:
 */
public class Leet872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        dfs(root1, list);
        dfs(root2, list1);
        if (list.size() != list1.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(list1.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void dfs(TreeNode treeNode, List list) {
        if (treeNode == null) {
            return;
        }
        dfs(treeNode.left, list);
        if (treeNode.left == null && treeNode.right == null) {
            list.add(treeNode.val);
        }
        dfs(treeNode.right, list);

    }
}
