package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/10/4 11:58
 * @description:
 */
public class Leet279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        int index = 1;
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 9999;
        }
        while (true) {
            if (index * index > n) {
                break;
            }
            dp[index * index] = 1;
            index++;
        }
        for (int i = 2; i < dp.length; i++) {
            for (int j = 1; j * j < i; j++) {
                dp[i] = Math.min(dp[i - j * j] +1, dp[i]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        new Leet279().numSquares(12);
    }
}
