package LeetCode.剑指offer;


import Array.Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer24 {
    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        dfs(root, target, new ArrayList());
        return lists;
    }

    public void dfs(TreeNode root, int target, ArrayList<Integer> list) {
        ArrayList arrayList = new ArrayList(list);
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (target - root.val == 0) {
                arrayList.add(root.val);
                lists.add(arrayList);
            }
            return;
        }
        arrayList.add(root.val);
        dfs(root.left, target - root.val, arrayList);
        dfs(root.right, target - root.val, arrayList);

    }
}
