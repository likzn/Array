package LeetCode.second;

import Array.Array;
import LeetCode.DP.Lee673;

import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/11/7 19:44
 * @description:
 */
public class Leet673 {
    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] dpConut = new int[nums.length];
        Arrays.fill(dpConut, 1);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        dpConut[i] = dpConut[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        dpConut[i] += dpConut[j];
                    }
                }
            }
            max = Math.max(dp[i], max);
        }
        int count = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] == max) {
                count += dpConut[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new Leet673().findNumberOfLIS(new int[]{1,2,3,1,2,3,1,2,3});
    }
}
