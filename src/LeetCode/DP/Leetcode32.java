package LeetCode.DP;

import javax.naming.InsufficientResourcesException;

/**
 * @author: Li jx
 * @date: 2019/7/24 08:46
 * @description:
 */
public class Leetcode32 {
    public int longestValidParentheses(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int leftCount = 0;
        int rightCount = 0;
        int length = s.length();
        int[] ints = new int[length];
        int[] int2 = new int[length];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftCount++;
                if (i == 0) {
                    continue;
                }
                ints[i] = ints[i - 1];
            }
            if (c == ')') {
                if (leftCount != 0) {
                    leftCount--;
                    ints[i] = ints[i - 1] + 2;
                } else {
                    if (i == 0) {
                        continue;
                    }
                    ints[i] = 0;
                }
            }
        }
        for (int i = s.length()-1; i >=0; i--) {
            char c = s.charAt(i);
            if (c == ')') {
                rightCount++;
                if (i == s.length()-1) {
                    continue;
                }
                int2[i] = int2[i + 1];
            }
            if (c == '(') {
                if (rightCount != 0) {
                    rightCount--;
                    int2[i] = int2[i + 1] + 2;
                } else {
                    if (i == s.length()-1) {
                        continue;
                    }
                    int2[i] = 0;
                }
            }
        }
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (ints[i] > a) {
                a = ints[i];
            }
            if (int2[i] > b) {
                b = int2[i];
            }
        }
        return a >= b ? b : a;
    }
}
