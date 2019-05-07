package LeetCode.other;

import java.util.Arrays;

/**
 * @auther: Li jx
 * @date: 2019/4/28 10:39
 * @description:
 */
public class Leet5059 {
    public int[] numMovesStones(int a, int b, int c) {
        int[] ints = new int[]{a, b, c};
        Arrays.sort(ints);
        a = ints[0];
        b = ints[1];
        c = ints[2];
        int min = 0;
        int max = 0;
        if (Math.abs(b - a) > 1) {
            min += 1;
        }
        if (Math.abs(c - b) > 1) {
            min += 1;
        }
        if (b - a == 2 || c - b == 2) {
            min = 1;
        }
        max = Math.abs(c - b) - 1 + Math.abs(a - b) - 1;

        return new int[]{min, max};
    }

}
