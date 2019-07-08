package LeetCode.DP;

/**
 * @auther: Li jx
 * @date: 2019/5/16 12:48
 * @description:
 */
public class Leetcode740 {
    public int deleteAndEarn(int[] nums) {
        int[] a = new int[10001];
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]] += nums[i];
        }
        int[] dp = new int[10001];
        dp[0] = 0;
        dp[1] = a[1];
        for (int i = 2; i < a.length; i++) {
            dp[i] = Math.max(dp[i - 2] + a[i], dp[i - 1]);
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        new Leetcode740().deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4});
    }
}
