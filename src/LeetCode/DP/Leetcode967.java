package LeetCode.DP;

import java.util.HashSet;

/**
 * @auther: Li jx
 * @date: 2019/7/15 11:36
 * @description:
 */
public class Leetcode967 {
    public int[] numsSameConsecDiff(int N, int K) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            set.add(i);
        }

        HashSet<Integer> set1 = null;
        for (int i = 0; i < N-1; i++) {
            set1 = new HashSet<>();
            for (Integer a : set) {
                int b = a % 10;
                if (b + K < 10) {
                    set1.add(a * 10 + b+K);
                }
                if (b - K >= 0) {
                    set1.add(a * 10 + (b-K));
                }
            }
            set = set1;
        }
        if (N == 0) {
            set.add(0);
        }
        int c = 0;
        int[] ints = new int[set.size()];
        for (Integer a : set) {
            ints[c++] = a;
        }
        return ints;
    }
}
