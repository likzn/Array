package LeetCode;
import java.util.Stack;
/**
 * @auther: Li jx
 * @date: 2019/4/7 19:52
 * @description:
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if (c == ')' && top != '(') {
                        return false;
                    }
                    if (c == '}' && top != '{') {
                        return false;
                    }
                    if (c == ']' && top != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }

    public int calPoints(String[] ops) {
        Stack<String> stack = new Stack();
        for (int i = 0; i < ops.length; i++) {
            String s = ops[i];
            if (s.equals("+")) {
                int i1 = Integer.valueOf(stack.get(stack.size() - 1));
                int i2 = Integer.valueOf(stack.get(stack.size() - 2));
                stack.push(String.valueOf(i1 + i2));
            } else if (s.equals("D")) {
                int i1 = Integer.valueOf(stack.get(stack.size() - 1));
                stack.push(String.valueOf(i1 * 2));
            } else if (s.equals("C")) {
                stack.pop();
            } else {
                stack.push(s);
            }

        }
        int sum = 0;
        for (String s : stack) {
            sum = sum + Integer.valueOf(s);
        }
        return sum;
    }

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (c.equals('#')) {
                if (stack1.isEmpty()) {
                    continue;
                } else {

                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }
        for (int i = 0; i < T.length(); i++) {
            Character c = T.charAt(i);
            if (c.equals('#')) {
                if (stack2.isEmpty()) {
                    continue;
                } else {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }
        return stack1.containsAll(stack2) && stack1.size() == stack2.size();

    }

    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (c.equals('(')) {
                stack.push(c);
            } else {
                if (!stack.isEmpty()&&!stack.peek().equals(c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.size();
    }

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public int removeDuplicates(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = 0;
        int[] ints = new int[nums.length];
        for (Integer i : nums) {
            if (a == i) {
                continue;
            }
            a = i;
            ints[b++] = a;

        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ints[i];
        }
        return b;
    }
    public int removeElement(int[] nums, int val) {

        int b = 0;
        int[] ints = new int[nums.length];
        for (Integer i : nums) {
            if (val == i) {
                continue;
            }
            ints[b++] = i;

        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ints[i];
        }
        return b;
    }
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i]) {
                continue;
            }
            if (target == nums[i]) {
                return i;
            }
            if (target < nums[i]) {
                return i+1;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        String s = "";
        System.out.println(s.length());
    }
}