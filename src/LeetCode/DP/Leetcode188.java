package LeetCode.DP;

/**
 * @auther: Li jx
 * @date: 2019/5/16 12:48
 * @description:
 */
public class Leetcode188 {
    public int maxProfit(int k, int[] prices) {
        int[][][] ints = new int[prices.length][k + 1][2];
        if (prices.length == 0) {
            return 0;
        }

        for (int i = 0; i <= k; i++) {
            ints[0][i][1] = -prices[0];
        }

        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j <= k; j++) {

                ints[i][j][0] = Math.max(ints[i - 1][j][0], ints[i - 1][j][1] + prices[i]);
                ints[i][j][1] = Math.max(ints[i - 1][j][1], ints[i - 1][j - 1][0] - prices[i]);

            }
        }
        return ints[prices.length - 1][k][0];

    }

}
