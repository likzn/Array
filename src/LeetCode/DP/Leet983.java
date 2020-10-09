package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/10/3 12:01
 * @description:
 */
public class Leet983 {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        int index = 0;
        for (int i = 1; i < dp.length; i++) {
            if (index < days.length && i == days[index]) {
                dp[i] = Math.min(dp[i - 1 > 0 ? i - 1 : 0]+costs[0], dp[i - 7 > 0 ? i - 7 : 0]+costs[1]);
                dp[i] = Math.min(dp[i], dp[i - 30 > 0 ? i - 39 : 0] + costs[2]);
                index++;
            } else {
                dp[i] = dp[i - 1];
            }
        }


        return dp[365];
    }

    public static void main(String[] args) {
        new Leet983().mincostTickets(new int[]{1, 4, 6, 7, 8, 20
        }, new int[]{2, 7, 15});
    }
}
