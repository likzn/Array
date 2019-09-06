package LeetCode.DP;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @author: Li jx
 * @date: 2019/8/7 13:51
 * @description:
 */
public class Leet91 {
    public int numDecodings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] dp = new int[s.length()];
        dp[0] =1 ;
        if (Integer.valueOf(s.substring(0, 2)) <= 26) {
            dp[1] = 2;
        } else {
            dp[1] = 1;
        }
        for (int i = 2; i < s.length(); i++) {
            if (Integer.valueOf(s.substring(i-1, i + 1)) <= 26) {
                dp[i] = dp[i - 2] + dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }
        return dp[s.length() - 1];
    }
}
