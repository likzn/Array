package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */
public class Leet977 {
    public int[] sortedSquares(int[] A) {
        PriorityQueue<Integer> queue = new PriorityQueue();
        for (int i = 0; i < A.length; i++) {
            queue.add(A[i] * A[i]);
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = queue.poll();
        }
        return A;
    }

}