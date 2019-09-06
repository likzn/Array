package LeetCode.Tree;

/**
 * @author: Li jx
 * @date: 2019/9/6 12:28
 * @description:
 */
public class Leet654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = left; i <= right; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode node = new TreeNode(nums[index]);
        node.left = build(nums, left, index - 1);
        node.right = build(nums, index + 1, right);
        return node;
    }
}
