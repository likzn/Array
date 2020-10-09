package LeetCode.other;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author: Li jx
 * @date: 2019/9/29 19:46
 * @description:
 */
public class Leet5205 {
    public boolean uniqueOccurrences(int[] arr) {
        int[] ints = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            ints[arr[i] + 1000]++;
        }
        Arrays.sort(ints);
        for (int i = ints.length - 2; i >= 0; i--) {
            if (ints[i] == 0) {
                break;
            }
            if (ints[i] == (ints[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Leet5205().uniqueOccurrences(new int[]{1, 2});
    }
}
