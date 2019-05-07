package LeetCode.Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * @auther: Li jx
 * @date: 2019/4/24 11:50
 * @description:
 */
public class Leet503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] ints = new int[nums.length*2];
        int[] ints1 = new int[nums.length];
        Arrays.fill(ints1, -1);
        for (int i = 0; i < nums.length; i++) {
            ints[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ints[i + nums.length] = nums[i];
        }
        Stack<Integer> stack = new Stack<>();
        for (int j = 0; j < ints.length; j++) {
            while (!stack.isEmpty() && ints[stack.peek()] < ints[j]) {
                ints1[stack.pop() % nums.length] = ints[j];
            }
            stack.push(j);
        }
        return ints1;
    }
}
