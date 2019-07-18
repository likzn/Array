package LeetCode.DP;

/**
 * @auther: Li jx
 * @date: 2019/5/16 12:48
 * @description:
 */
public class Leetcode123 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[][][] ints = new int[prices.length][3][2];
        ints[0][1][0] = 0;
        ints[0][1][1] = -prices[0];
        ints[0][2][0] = 0;
        ints[0][2][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            ints[i][1][0] = Math.max(ints[i-1][1][0], ints[i - 1][1][1] + prices[i]);
            ints[i][1][1] = Math.max(ints[i-1][1][1], -prices[i]);
            ints[i][2][0] = Math.max(ints[i-1][2][0], ints[i - 1][2][1] + prices[i]);
            ints[i][2][1] = Math.max(ints[i-1][2][1], ints[i - 1][1][0] - prices[i]);
        }
        return ints[prices.length - 1][2][0];
    }
}
