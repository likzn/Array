package LeetCode.Stack;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Stack;

/**
 * @auther: Li jx
 * @date: 2019/4/24 11:50
 * @description:
 */
public class Leet394 {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack();
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ']') {
                char popChar = stack.pop();
                while (popChar != '[') {
                    str = popChar + str;
                    popChar = stack.pop();
                }
                popChar = stack.pop();
                sb.delete(0, sb.length());
                for (int j = 0; j < popChar - '0'; j++) {
                    sb.append(str);
                }
                str = sb.toString();
            } else {
                stack.push(c);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Leet394().decodeString("3[fd]2[bc]"));
    }
}
