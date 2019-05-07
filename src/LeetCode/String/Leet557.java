package LeetCode.String;

import java.util.TreeSet;

/**
 * @auther: Li jx
 * @date: 2019/4/21 16:04
 * @description:
 */
public class Leet557 {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            int a = strings[i].length() - 1;
            while (a >= 0) {
                sb.append(strings[i].charAt(a--));
            }
            if (i != strings.length - 1) {
                sb.append(" ");

            }
        }
        return sb.toString();
    }
}
