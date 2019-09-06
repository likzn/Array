package LeetCode.other;

import java.util.PriorityQueue;

/**
 * @author: Li jx
 * @date: 2019/9/5 10:28
 * @description:
 */
public class Leet907 {
    public int sumSubarrayMins(int[] A) {
        int sum = 0;
        PriorityQueue<Integer> heap;
        for (int i = 0; i < A.length; i++) {
            heap = new PriorityQueue<>();
            for (int j = i; j < A.length; j++) {
                heap.add(A[j]);
                sum += heap.peek();
            }
            sum = (int) (sum % (Math.pow(10, 9) + 7));
        }
        return (int) (sum % (Math.pow(10, 9) + 7));
    }
}
