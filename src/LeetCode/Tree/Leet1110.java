package LeetCode.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/11 16:21
 * @description:
 */
public class Leet1110 {
    //答案的集合
    List<TreeNode> list = new ArrayList<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        //建立set方便节点进行判断
        HashSet set = new HashSet();
        for (int i = 0; i < to_delete.length; i++) {
            set.add(to_delete[i]);
        }
        //直接把根插入集合，因为经过后续判断后就是删除后的root
        if (!set.contains(root.val)) {
            list.add(root);
        }
        //进行后续遍历
        dfs(root, set);
        return list;

    }

    public void dfs(TreeNode root, HashSet set) {
        if (root == null) {
            return;
        }
        //后序遍历，即左右根
        dfs(root.left, set);
        dfs(root.right, set);

        //若该节点是需要删除的节点
        if (set.contains(root.val)) {
            //查看左节点是否在删除set，不在的话进行插入
            if (root.left != null && !set.contains(root.left.val)) {
                list.add(root.left);
            }
            //类似，查看右节点是否在删除set，不在的话进行插入
            if (root.right != null && !set.contains(root.right.val)) {
                list.add(root.right);
            }
        }
        //若该节点是不需要删除的节点，则判断左右节点，若需要删除直接指向null
        if (root.left != null && set.contains(root.left.val)) {
            root.left = null;
        }
        if (root.right != null && set.contains(root.right.val)) {
            root.right = null;
        }
    }
}
