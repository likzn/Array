package LeetCode.Array;

import Array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */
public class Leet962 {
    public int maxWidthRamp(int[] A) {
        int[][] ints = new int[A.length][];
        for (int i = 0; i < A.length; i++) {
            ints[i][0] = A[i];
            ints[i][1] = i;
        }
        Arrays.sort(ints);
        int sum = 0;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            sum = Math.max(sum, ints[i][1] - small);
            if (ints[i][1] < small) {
                small = ints[i][1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        new Leet962().maxWidthRamp(new int[]{9, 8, 1, 0, 1, 9, 4, 0, 4, 1});
    }
}