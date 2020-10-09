package LeetCode.剑指offer;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer8 {
    public int JumpFloor(int target) {
        if (target == 0 || target == 1) {
            return 1;
        }
        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < target + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[target];
    }
}
