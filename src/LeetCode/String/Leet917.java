package LeetCode.String;


import java.util.Stack;

/**
 * @author: Li jx
 * @date: 2019/9/7 10:59
 * @description:
 */
public class Leet917 {
    public String reverseOnlyLetters(String S) {
        Stack stack = new Stack();
        for (int i = 0; i < S.length(); i++) {
            if ((S.charAt(i) >= 'A' && S.charAt(i) <= 'Z')||(S.charAt(i) >= 'a' && S.charAt(i) <= 'z')) {
                stack.add(S.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if ((S.charAt(i) >= 'A' && S.charAt(i) <= 'Z')||(S.charAt(i) >= 'a' && S.charAt(i) <= 'z')) {
                sb.append(stack.pop());
            } else {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

}
