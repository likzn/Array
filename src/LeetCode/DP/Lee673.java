package LeetCode.DP;

import Array.Array;

import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/8/7 14:19
 * @description:
 */
public class Lee673 implements Cloneable{
    public int findNumberOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int[] count = new int[dp.length];
        Arrays.fill(count, 1);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = Math.max(dp[j] + 1, dp[i]);
                        count[i] = count[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j];
                    }
                }



            }
            max = Math.max(max, dp[i]);
        }
        int ans = 0;
        for (int i = 0; i < dp.length; i++) {
            if (max == dp[i]) {
                ans+=count[i];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        new Lee673().findNumberOfLIS(new int[]{1, 2, 4, 3, 5, 4, 7, 2});
    }
}
