package LeetCode.剑指offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer20 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int node) {
        stack.push(node);
        if (!min.isEmpty()) {
            int minNum = min.peek();
            min.push(minNum < node ? minNum : node);
        } else {
            min.push(node);
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.pop();
    }

    public int min() {
        return min.peek();
    }
}
