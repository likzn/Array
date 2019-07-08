package LeetCode.Stack;

import java.util.Stack;

/**
 * @auther: Li jx
 * @date: 2019/4/24 11:50
 * @description:
 */
public class Leet856 {
    public int scoreOfParentheses(String S) {
        int length = S.length();
        int n = 0;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == '(') {
                if (n == 0) {
                    n = 1;
                } else {
                    n *= 2;
                }
            } else {
                if (S.charAt(i) == ')' && S.charAt(i - 1) == '(') {
                    sum += n;
                }
                n /= 2;
            }
        }
        return sum;
    }
}
