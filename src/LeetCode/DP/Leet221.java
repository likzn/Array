package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/9/22 16:11
 * @description:
 */
public class Leet221 {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int[][] dp = new int[matrix.length][matrix[0].length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = 1;
                    max = 1;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (dp[i][j] > 0 && dp[i][j - 1] > 0 && dp[i - 1][j] > 0 && dp[i - 1][j - 1] > 0) {
                    dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]);
                    dp[i][j] = Math.min(dp[i][j ], dp[i - 1][j-1])+1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max * max;
    }
}
