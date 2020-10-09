package LeetCode.second;

import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/11/7 19:44
 * @description:
 */
public class Leet628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] < 0 && nums[1] < 0) {
            return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
        }
        return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
    }
}
