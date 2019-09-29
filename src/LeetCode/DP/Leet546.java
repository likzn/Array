package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/9/20 14:52
 * @description:
 */
public class Leet546 {
    public int removeBoxes(int[] boxes) {
        int[][][] dp = new int[100][100][100];
        return dfs(boxes, 0, boxes.length - 1, 0, dp);
    }

    public int dfs(int[] boxes, int i, int j, int k, int[][][] dp) {
        if (i > j) {
            return 0;
        }
        if (dp[i][j][k] > 0) {
            return dp[i][j][k];
        }
        int res = (k + 1) * (k + 1) + dfs(boxes, i + 1, j, 0, dp);
        for (int m = i + 1; m <= j; m++) {
            if (boxes[m] == boxes[i]) {
                res = Math.max(res, dfs(boxes, i + 1, m - 1, 0, dp) + dfs(boxes, m, j, k + 1, dp));
            }
        }
        return dp[i][j][k] =res;
    }
}
