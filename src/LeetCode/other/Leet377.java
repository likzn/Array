package LeetCode.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/4 18:18
 * @description:
 */
public class Leet377 {
    public int combinationSum4(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i - nums[j] >= 0) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        new Leet377().combinationSum4(new int[]{1, 2, 3}, 4);
    }
}
