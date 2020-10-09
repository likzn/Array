package LeetCode.other;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author: Li jx
 * @date: 2019/9/29 20:19
 * @description:
 */
public class Leet5206 {
    public String removeDuplicates(String s, int k) {
        Stack<HashMap<Character,Integer>> stack = new Stack<>();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put(s.charAt(0), 1);
        stack.push(map);
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                map = new HashMap<>();
                map.put(c, 1);
                stack.push(map);
                continue;
            }
            HashMap<Character,Integer> top = stack.peek();
            if (top.get(c) == null) {
                map = new HashMap<>();
                map.put(c, 1);
                stack.push(map);
            } else {
                int time = top.get(c);
                if (time + 1 == k) {
                    stack.pop();
                } else {
                    top.put(c, top.get(c) + 1);
                    stack.pop();
                    stack.push(top);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            HashMap<Character,Integer> top = stack.pop();
            char c = top.keySet().iterator().next();
            for (int i = 0; i < top.get(c); i++) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        new Leet5206().removeDuplicates("deeedbbcccbdaa", 3);
    }
}
