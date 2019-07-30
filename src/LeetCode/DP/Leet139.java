package LeetCode.DP;

import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/7/30 09:31
 * @description:
 */
public class Leet139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] memo = new boolean[n + 1];
        memo[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (memo[j] && wordDict.contains(s.substring(j, i))) {
                    memo[i] = true;
                    break;

                }
            }
        }
        return memo[n];
    }
}
