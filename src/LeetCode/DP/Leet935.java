package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/9/21 13:01
 * @description:
 */
public class Leet935 {
    /** 假设穷举，1后面可以按6和8，6可以按1 7 0，发现又出现了1，而1只能按6 8
     * 所以我们就可以想到用动态规划求解，而dp采用的是自底向上，所以先求出N为i-1时，
     * 再求出i，因此就可以写出状态转移方程，假设求最后一位是0,号码长度为j,则
     * dp[0][j] = dp[4][j - 1] + dp[6][j - 1]
     * 其实很好理解，假如要按两位的号码，如果最后一位是0，那么只能从4或6才能跳到0，
     * 因此只要从一位号码的中选取4和6相加即可，三位号码同理，
     * dp[0][3] = dp[4][2] + dp[6][2]
     * 而dp[4][2] =dp[3][1] + dp[9][1] + dp[0][1];
     * 所以自定向上，答案就出来了。
     * */
    public int knightDialer(int N) {
        //dp数组，十个按键，长度为N的号码，从1开始dp直到N
        //要用long，不然会溢出
        long[][] dp = new long[10][N + 1];
        //取模
        int mod = 1000000000 + 7;
        //base条件，即一位号码的数量
        for (int i = 0; i < 10; i++) {
            dp[i][1] = 1;
        }
        //进行动态规划，自底向上
        for (int j = 2; j < N + 1; j++) {
            dp[0][j] = ((dp[4][j - 1] + dp[6][j - 1]) % mod);
            dp[1][j] = ((dp[6][j - 1] + dp[8][j - 1]) % mod);
            dp[2][j] = ((dp[7][j - 1] + dp[9][j - 1]) % mod);
            dp[3][j] = ((dp[4][j - 1] + dp[8][j - 1]) % mod);
            dp[4][j] = ((dp[3][j - 1] + dp[9][j - 1] + dp[0][j - 1]) % mod);
            dp[6][j] = ((dp[1][j - 1] + dp[7][j - 1] + dp[0][j - 1]) % mod);
            dp[7][j] = ((dp[2][j - 1] + dp[6][j - 1]) % mod);
            dp[8][j] = ((dp[1][j - 1] + dp[3][j - 1]) % mod);
            dp[9][j] = ((dp[2][j - 1] + dp[4][j - 1]) % mod);
        }
        //进行相加
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = (sum + dp[i][N]) % mod;
        }
        return (int) sum;

    }
}
