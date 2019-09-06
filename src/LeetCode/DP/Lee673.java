package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/8/7 14:19
 * @description:
 */
public class Lee673 {
    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[1] = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    dp[i] = dp[j] + 1;
                    break;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < dp.length; i++) {
            if (max == dp[i]) {
                sum++;
            }
        }
        return sum;
    }
}
