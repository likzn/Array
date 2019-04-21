package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrderBottom(root, list, 0);
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            List list1 = list.get(i);
            list.set(i, list.get(j));
            list.set(j, list1);
            i++;
            j--;
        }
        return list;
    }

    public void levelOrderBottom(TreeNode root,List<List<Integer>> lists,int depth) {
        if (root == null) {
            return;
        }
        if (lists.size() == depth) {
            List l = new ArrayList();
            l.add(root.val);
            lists.add(l);

        } else {
            lists.get(depth).add(root.val);
        }
        levelOrderBottom(root.left, lists, depth + 1);
        levelOrderBottom(root.right, lists, depth + 1);

    }

}
