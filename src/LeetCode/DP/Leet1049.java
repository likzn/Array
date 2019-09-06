package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/9/3 17:17
 * @description:
 */
public class Leet1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (Integer i : stones) {
            sum += i;
        }
        int[] dp = new int[sum / 2 + 1];
        for (int i = 0; i < stones.length; i++) {
            for (int j = sum / 2; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - dp[sum / 2] * 2;
    }
}
