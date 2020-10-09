package 笔试;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author: Li jx
 * @date: 2020/9/15 19:14
 * @description:
 */
public class 小米9_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String source = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            if (set.contains(c)) {
                continue;
            }
                set.add(c);
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder.toString());

    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()) {
//            String source = sc.nextLine();
//            Stack<Character> stack = new Stack<>();
//            for (int i = 0; i < source.length(); i++) {
//                char c = source.charAt(i);
//                if (stack.isEmpty()) {
//                    stack.push(c);
//                } else if (c == '(' || c == '{' || c == '[') {
//                    stack.push(c);
//                } else {
//                    char peek = stack.peek();
//                    if (c == ')' && peek == '(') {
//                        stack.pop();
//                    }else if (c == ']' && peek == '[') {
//                        stack.pop();
//                    } else if (c == '}' && peek == '{') {
//                        stack.pop();
//                    } else {
//                        stack.push(c);
//                    }
//                }
//            }
//            System.out.println(stack.isEmpty());
//        }
//    }
}
