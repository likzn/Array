package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/10/2 20:39
 * @description:
 */
public class Leet1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }
        int[] dp = new int[sum / 2 + 1];
        for (int i = 0; i < stones.length; i++) {
            for (int j = sum / 2; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - dp[sum / 2] - dp[sum / 2];
    }

    public static void main(String[] args) {
        new Leet1049().lastStoneWeightII(new int[]{2, 7, 4, 1, 8, 1});
    }
}
