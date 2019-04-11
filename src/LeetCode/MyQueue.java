package LeetCode;

import java.util.Stack;

/**
 * @auther: Li jx
 * @date: 2019/4/9 18:16
 * @description:
 */
class MyQueue {
    Stack<Integer> stack;
    int front;
    int tail;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack = new Stack<>();

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        int i = stack.get(0);
        stack.remove(0);
        return i;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stack.get(0);
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */