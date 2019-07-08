package LeetCode.DP;

/**
 * @auther: Li jx
 * @date: 2019/5/16 12:48
 * @description:
 */
public class Leetcode198 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] sum = new int[nums.length];
        int i = 0;

        while (i != nums.length) {
            sum[i] = Math.max((i - 2 >= 0 ? sum[i - 2] : 0) + nums[i], i - 1 >= 0 ? sum[i - 1] : 0);
            i++;
        }
        return sum[nums.length - 1];
    }
}
