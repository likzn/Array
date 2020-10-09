package LeetCode.剑指offer;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer29 {
    ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if (str.equals("")) {
            return list;
        }
        char[] chars = str.toCharArray();
        boolean[] use = new boolean[chars.length];
        dfs(chars, use, new StringBuilder());
        return list;
    }

    public void dfs(char[] chars, boolean[] use, StringBuilder s) {
        if (s.length() == chars.length) {
            list.add(s.toString());
        }
        for (int i = 0; i < chars.length; i++) {
            if (i > 0 && chars[i] == chars[i - 1] && !use[i - 1]) {
                continue;
            }
            if (!use[i]) {
                s.append(chars[i]);
                use[i] = true;
                dfs(chars, use, new StringBuilder(s));
                use[i] = false;
                s.deleteCharAt(s.length() - 1);
            }
        }
    }

    public int numDecodings(String s) {
        int length = s.length();
        int[] dp = new int[length + 1];
        dp[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            int s1 = (c1 - '0') * 10 + c2 - '0';
            if (s1 >= 0 && s1 <= 26) {
                dp[i] = dp[i + 1] + dp[i + 2];
            } else {
                dp[i] = dp[i + 1];
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        new Offer29().Permutation("ab");
    }
}
