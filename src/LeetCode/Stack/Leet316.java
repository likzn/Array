package LeetCode.Stack;

import java.util.Stack;

/**
 * @auther: Li jx
 * @date: 2019/7/17 11:34
 * @description:
 */
public class Leet316 {
    public String removeDuplicateLetters(String s) {
        char[] chars = s.toCharArray();
        int[] ints = new int[26];
        int[] use = new int[26];
        Stack<Character> stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            ints[chars[i] - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            ints[c - 'a']--;
            while (!stack.empty() && stack.peek() > c && ints[stack.peek() - 'a'] != 0 && use[c - 'a'] == 0) {
                use[stack.pop() - 'a'] = 0;
            }
            if (use[c - 'a'] == 0) {
                stack.push(c);
                use[c - 'a'] = 1;
            }

        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();


    }
}
