package LeetCode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/10/2 13:36
 * @description:
 */
public class Leet54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new ArrayList<>();
        }
        List list = new ArrayList();
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[up][i]);
            }
            if (++up > down) {
                break;
            }
            for (int i = up; i <= down; i++) {
                list.add(matrix[i][right]);
            }
            if (--right < left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                list.add(matrix[down][i]);
            }
            if (--down < up) {
                break;
            }
            for (int i = down; i >= up; i--) {
                list.add(matrix[i][left]);
            }
            if (++left>right) {
                break;
            }
        }
        return list;
    }
}
