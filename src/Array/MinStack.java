package Array;

import java.util.Iterator;
import java.util.Stack;

/**
 * @auther: Li jx
 * @date: 2019/4/7 20:16
 * @description:
 */
class MinStack {
    Stack<Integer> stack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack();
    }

    public void push(int x) {
        if (stack.empty()) {
            stack.push(x);
            stack.push(x);
        } else {
            Integer i = stack.peek();
            if (x < i) {
                stack.pop();
                stack.push(x);
                stack.push(x);
            } else {
                stack.pop();
                stack.push(x);
                stack.push(i);
            }
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
        Iterator<Integer> iterator = stack.iterator();
        int a = Integer.MAX_VALUE;

        while (iterator.hasNext()) {
            int b = iterator.next();
            if (a > b) {
                a = b;
            }
        }
        stack.push(a);
    }

    public int top() {
        return stack.get(stack.size() - 2);
    }

    public int getMin() {
        return stack.get(stack.size() - 1);
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();
    }
}

/**
 * Your Array.MinStack object will be instantiated and called as such:
 * Array.MinStack obj = new Array.MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */