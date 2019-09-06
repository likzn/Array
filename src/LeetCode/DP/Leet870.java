package LeetCode.DP;

import Array.Array;

import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/8/8 17:00
 * @description:
 */
public class Leet870 {
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int[] newA = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] > B[i]) {
                    newA[i] = A[j];
                    A[j] = -1;
                    break;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (newA[i] == 0) {
                for (int j = 0; j < A.length; j++) {
                    if (A[j] != -1) {
                        newA[i] = A[j];
                        A[j] = -1;
                        break;

                    }
                }
            }
        }
        return newA;
    }
}
