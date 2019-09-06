package LeetCode.DP;

import com.sun.org.apache.bcel.internal.generic.I2B;

/**
 * @author: Li jx
 * @date: 2019/7/31 15:26
 * @description:
 */
public class Leet413 {
    public int numberOfArithmeticSlices(int[] A) {
        int[] dp = new int[A.length];
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 0;
            }
        }
        int sum = 0;
        for (int a : dp) {
            sum += a;
        }
        return sum;
    }
}
