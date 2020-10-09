package LeetCode.剑指offer;

import java.util.Stack;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        //弹出顺序，一开始为第一个
        int popIndex = 0;
        //遍历压入顺序
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            //当栈不为空，并且弹出顺序的值等于压入顺序的值，那么就把栈中的值弹出，popIndex并加一，继续循环。
            //例如，1,2,3,4,5和4,5,3,2,1
            //1≠4，压入
            //2≠4，压入
            //3≠4，压入
            //4=4，弹出，Index++，3≠5
            //5=5，弹出，3=3，弹出，2=2，弹出，1=1弹出
            //结束
            while (!stack.isEmpty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
