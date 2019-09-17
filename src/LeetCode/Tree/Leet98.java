package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/13 20:41
 * @description:
 */
public class Leet98 {
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        dfs(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);

    }



}
