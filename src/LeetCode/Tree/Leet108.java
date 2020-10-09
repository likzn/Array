package LeetCode.Tree;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: Li jx
 * @date: 2019/10/2 15:50
 * @description:
 */
public class Leet108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        //数组不存在返回null
        if (nums == null || nums.length == 0) {
            return null;
        }
        //高度平衡所以取直接的值为根节点
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        //递归，左边的值为左子树，并重新建树
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length  / 2));
        //右子树同理
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length  / 2 + 1, nums.length));
        return root;
    }


}
