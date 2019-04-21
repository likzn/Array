package LeetCode.other;

import java.util.Arrays;

/**
 * @auther: Li jx
 * @date: 2019/4/16 20:01
 * @description:
 */
public class LeetCode_899 {
    public String orderlyQueue(String S, int K) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = S.toCharArray();
        if (K > 1) {
            Arrays.sort(chars);
            for (int i = 0; i < chars.length; i++) {
                stringBuilder.append(chars[i]);
            }
        }
        String t = S;
        int len = S.length();
        S = S + S;
        for (int i = 0; i < len; i++) {
            if (t.compareTo(S.substring(i, i + len)) > 0)
                t = S.substring(i, i + len);
        }
        return t;

    }

    public static void main(String[] args) {
        new LeetCode_899().orderlyQueue("cba", 1);
    }

}
