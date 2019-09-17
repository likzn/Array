package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/10 19:35
 * @description:
 */
public class Leet501 {
    int preNum = -1;
    int curTimes = 0;
    int maxTimes = -1;
    List list = new ArrayList();
    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] ints = new int[list.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) list.get(i);
        }
        return ints;
    }

    public void dfs(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        dfs(treeNode.left);
        if (treeNode.val == preNum) {
            curTimes++;
        } else {
            preNum = treeNode.val;
            curTimes = 0;
        }
        if (curTimes == maxTimes) {
            list.add(treeNode.val);
        }
        if (curTimes > maxTimes) {
            maxTimes = curTimes;
            list.clear();
            list.add(treeNode.val);
        }
        dfs(treeNode.right);
    }
}
