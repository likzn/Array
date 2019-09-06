package LeetCode.DP;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

/**
 * @author: Li jx
 * @date: 2019/8/7 11:37
 * @description:
 */
public class Leet120 {
    public int minimumTotal(List<List<Integer>> triangle) {

        int[][] dp = new int[triangle.size()][triangle.get(triangle.size() -1).size()];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i][j] = triangle.get(i).get(j);
            }
        }
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i][j] += Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }

}
