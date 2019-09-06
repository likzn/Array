package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/7/31 10:04
 * @description:
 */
public class Leetcode746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        dp[cost.length] = Math.min(dp[cost.length - 1], dp[cost.length - 2]);
        return dp[cost.length];
    }
}
