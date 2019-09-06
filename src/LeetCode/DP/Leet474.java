package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/7/31 08:59
 * @description:
 */
public class Leet474 {
    public int findMaxForm(String[] strs, int m, int n) {
        if (strs.length == 0) {
            return 0;
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            int zero = 0;
            int one = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
            for (int j =  m; j>= zero; j--) {
                for (int k = n; k >= one; k--) {
                        dp[j][k] = Math.max(dp[j][k], dp[j - zero][k - one] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
