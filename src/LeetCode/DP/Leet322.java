package LeetCode.DP;

import Array.Array;

import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/7/30 16:21
 * @description:
 */
public class Leet322 {
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0) {
            return -1;
        }
        int[] count = new int[amount + 1];
        Arrays.fill(count, amount + 1);
        count[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j - coins[i] >= 0) {
                    count[j] = Math.min(count[j], count[j - coins[i]] + 1);
                }
            }
        }
        return count[amount]==amount+1?-1:count[amount];
    }
}
