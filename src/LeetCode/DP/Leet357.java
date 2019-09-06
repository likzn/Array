package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/8/13 17:03
 * @description:
 */
public class Leet357 {
    public int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 10;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 2]) * (10 - (i - 1));
        }
        return dp[n];
    }
}
