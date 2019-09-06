package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/8/9 15:08
 * @description:
 */
public class Leet813 {
    public double largestSumOfAverages(int[] A, int K) {
        double[][] dp = new double[A.length][K];

        double[] sum = new double[A.length + 1];
        for (int i = 1; i < A.length+1; i++) {
            sum[i] = sum[i-1] + A[i - 1];
            dp[i-1][0] = sum[i]/i;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j < K; j++) {
                for (int k = 0; k < i; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[k][j - 1] + (sum[i + 1] - sum[k + 1]) / (i-k));
                }
            }
        }
        return dp[A.length - 1][K-1];
    }
}
