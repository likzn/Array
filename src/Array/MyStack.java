package Array;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @auther: Li jx
 * @date: 2019/4/9 18:22
 * @description:
 */
class MyStack {
    Deque<Integer> deque;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        deque = new ArrayDeque<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        deque.addLast(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return deque.pollLast();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return deque.getLast();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return deque.isEmpty();
    }
}
