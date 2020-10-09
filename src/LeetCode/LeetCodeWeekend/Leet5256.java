package LeetCode.LeetCodeWeekend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/11/10 11:15
 * @description:
 */
public class Leet5256 {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int[][] ints = new int[2][colsum.length];
        int sum = 0;
        for (int i = 0; i < colsum.length; i++) {
            sum += colsum[i];
        }
        if (sum != upper + lower) {
            return new ArrayList<>();
        }
        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] == 2) {
                if (upper == 0 || lower == 0) {
                    return new ArrayList<>();
                }
                ints[0][i] = 1;
                upper--;
                lower--;
                ints[1][i] = 1;
            }
        }
        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] == 1) {
                if (upper > 0) {
                    ints[0][i] = 1;
                    upper--;
                } else {
                    ints[1][i] = 1;
                }
            }
        }
        List<List<Integer>> lists = new ArrayList<>();
        List list = new ArrayList();
        List list1 = new ArrayList();
        for (int i = 0; i < ints[0].length; i++) {
            list.add(ints[0][i]);
            list1.add(ints[1][i]);
        }
        lists.add(list);
        lists.add(list1);
        return lists;
    }
}
