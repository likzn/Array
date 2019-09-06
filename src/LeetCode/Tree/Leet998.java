package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/6 12:37
 * @description:
 */
public class Leet998 {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        List<Integer> list = new ArrayList<>();
        mid(list, root);
        list.add(val);

        return build(list, 0, list.size() - 1);

    }

    public void mid(List list, TreeNode root) {
        if (root == null) {
            return;
        }
        mid(list, root.left);
        list.add(root.val);
        mid(list,root.right);
    }

    public TreeNode build(List<Integer> list, int left, int right) {
        if (left > right) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = left; i <= right; i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                index = i;
            }
        }
        TreeNode node = new TreeNode(list.get(index));
        node.left = build(list, left, index - 1);
        node.right = build(list, index + 1, right);
        return node;
    }
}
