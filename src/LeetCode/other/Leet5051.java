package LeetCode.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * @auther: Li jx
 * @date: 2019/4/28 10:39
 * @description:
 */
public class Leet5051 {
    public boolean isBoomerang(int[][] points) {
        int[] a = points[0];
        int[] b = points[1];
        int[] c = points[2];
        if (Arrays.equals(a, c) ||Arrays.equals(b, a) || Arrays.equals(b, c)) {
            return false;
        }
        if ((b[1] - a[1]) == 0) {
            if ((b[1] - c[1]) == 0) {
                return false;
            }
        }
        if ((b[0] - a[0]) / (b[1] - a[1]) == (b[0] - c[0]) / (b[1] - c[1])) {
            return false;
        }
        return true;
    }

}
