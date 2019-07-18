package LeetCode.DP;

/**
 * @auther: Li jx
 * @date: 2019/7/12 17:58
 * @description:
 */
public class Leetcode_714 {
    public int maxProfit(int[] prices, int fee) {
        int dpn1 = Integer.MIN_VALUE;
        int dpn0 = 0;
        for (Integer price : prices) {
            dpn0 = Math.max(dpn1 + price - fee, dpn0);
            dpn1 = Math.max(dpn1, dpn0 - price);
        }
        return dpn0;
    }
    public int maxProfit(int[] prices) {
        int[][] dp= new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            dp[i][1] = Math.max(dp[i][1],-prices[i]);
            dp[i][0] = Math.max(dp[i][0],dp[i][1]+prices[i]);

        }
        return dp[prices.length-1][0];
    }
}
