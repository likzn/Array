package LeetCode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/7/29 09:23
 * @description:
 */
public class Leet922 {
    public int[] sortArrayByParityII(int[] A) {
        List<Integer> ji = new ArrayList<>();
        List<Integer> ou = new ArrayList<>();
        int i = 0;
        while (ji.size() != A.length / 2 || ou.size() != A.length / 2) {
            if (A[i] % 2 == 0) {
                ou.add(A[i]);
            } else {
                ji.add(A[i]);
            }
            i++;
        }
        i = 0;
        for (int j = 0; j < A.length / 2; j++) {
            A[i] = ou.get(j);
            i++;
            A[i] = ji.get(j);
            i++;
        }
        return A;


    }
}
