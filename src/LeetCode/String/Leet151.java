package LeetCode.String;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/20 19:43
 * @description:
 */
public class Leet151 {
    public String reverseWords(String s) {
        boolean blank = false;
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                if (!"".equals(sb.toString())) {
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }
                blank = true;
                continue;
            } else {
                blank = false;
            }
            if (!blank) {
                sb.append(chars[i]);
            }
        }
        if (!blank) {
            list.add(sb.toString());
        }

        StringBuilder s1 = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            s1.append(list.get(i));
            if (i != 0) {
                s1.append(" ");
            }
        }
        return s1.toString();
    }

    public static void main(String[] args) {
        new Leet151().reverseWords("a good   example");
    }
}
