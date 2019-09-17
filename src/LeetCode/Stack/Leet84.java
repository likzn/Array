package LeetCode.Stack;

import Array.Array;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author: Li jx
 * @date: 2019/9/13 16:48
 * @description:
 */
public class Leet84 {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int[] newHeights = Arrays.copyOf(heights, heights.length + 1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length + 1; i++) {
            while (!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                int num = stack.pop();
                max = Math.max(max, (stack.isEmpty() ? i : (i - stack.peek() - 1)) * newHeights[num]);
            }
            stack.push(i);
        }
        return max;
    }

    public static void main(String[] args) {
        new Leet84().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
    }
}
