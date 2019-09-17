package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/15 20:27
 * @description:
 */
public class Leet113 {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        dfs(root, sum, new ArrayList<>());
        return list;
    }

    public void dfs(TreeNode root, int sum, List<Integer> curList) {
        if (root == null) {
            return;
        }
        List<Integer> list1 = new ArrayList<>(curList);
        list1.add(root.val);
        if (root.left==null&&root.right==null&&sum - root.val == 0) {
            list.add(list1);
        }

        dfs(root.left, sum - root.val,list1);
        dfs(root.right, sum - root.val,list1);

    }
}
