package LeetCode.Tree;

/**
 * @author: Li jx
 * @date: 2019/9/13 12:14
 * @description:
 */

//相当好理解,深度优先遍历,若子节点大于1，向父节点传输，反之，父节点向子节点传输
public class Leet979 {
    //统计移动数量
    int sum = 0;
    public int distributeCoins(TreeNode root) {
        //dfs
        dfs(root,null);
        return sum;
    }

    public void dfs(TreeNode root,TreeNode parent) {
        if (root == null) {
            return;
        }
        //后续遍历，左右根
        dfs(root.left,root);
        dfs(root.right, root);

        if (parent != null) {
            //当子节点金币大于1，把多余的传给父节点
            if (root.val >= 1) {
                parent.val += root.val - 1;
                sum += root.val - 1;
                root.val = 1;
                //反之，父节点向子节点传输
            } else {
                int num = 1 - root.val;
                sum += num;
                root.val += num;
                parent.val -= num;
            }
        }
    }
}
