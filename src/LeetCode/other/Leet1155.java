package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/9/24 16:57
 * @description:
 */
public class Leet1155 {
    /** 一开始dfs直接超时了,然后用dp解决
     *  我们可以一个一个扔骰子，假如为2 5 10
     *  你想得到总和为7，而骰子的面只有一到五
     *  因此7可以由上一次总和为2的情况再加一个5
     *  或者3的情况加一个4，等等
     *  公式：dp[2][7] = dp[1][6] +dp[1][5] +dp[1][4] +dp[1][3] +dp[1][2];
     *  再假如为3 5 10
     *  dp[3][10] = dp[2][9] +dp[2][8] +dp[2][7] +dp[2][6] +dp[2][5];
     *  自定向上答案就出来了
     * */
    public int numRollsToTarget(int d, int f, int target) {
        //求模的mod
        int mod = (int) (Math.pow(10, 9) + 7);
        //dp[骰子数][总和数] 用long防止溢出 骰子数从1到d 总和从1到target
        long[][] dp = new long[d][target + 1];
        //base条件，扔一个的情况
        int length = Math.min(f, target);
        for (int i = 1; i <= length; i++) {
            dp[0][i] = 1;
        }
        //第一层循环为骰子数量
        for (int i = 1; i < d ; i++) {
            //为总和数
            for (int j = 1; j < target + 1; j++) {
                //每次进行计算上次总和的f种情况相加
                //举例：dp[2][7] = dp[1][6] +dp[1][5] +dp[1][4] +dp[1][3] +dp[1][2];
                //骰子几面就从target-1 到 target-d 的总和
                int k = j - 1;
                int time = f;
                while ( k != 0 && (time-- != 0)) {
                    dp[i][j] += dp[i - 1][k--];
                    dp[i][j] %= mod;
                }
            }
        }
        return (int) dp[d-1][target];
    }
}
