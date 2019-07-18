package LeetCode.DP;

/**
 * @auther: Li jx
 * @date: 2019/5/16 12:48
 * @description:
 */
public class Leetcode309 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int dpi0 = 0;
        int dpi1 = -999;
        int dprei = 0;

        for (int i = 0; i < prices.length; i++) {
            int temp = dpi0;
            dpi0 = Math.max(dpi0, dpi1+prices[i]);

            dpi1 = Math.max(dpi1, dprei - prices[i]);
            dprei = temp;
        }
        return dpi0;
    }

}
