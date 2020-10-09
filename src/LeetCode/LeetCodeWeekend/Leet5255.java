package LeetCode.LeetCodeWeekend;

/**
 * @author: Li jx
 * @date: 2019/11/10 11:03
 * @description:
 */
public class Leet5255 {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] ints = new int[n][m];
        for (int i = 0; i < indices.length; i++) {
                for (int k = 0; k < m; k++) {
                    ints[indices[i][0]][k]++;
                }
                for (int k = 0; k < n; k++) {
                    ints[k][indices[i][1]]++;
                }
        }
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if ((ints[i][j] & 1) == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new Leet5255().oddCells(2, 3, new int[][]{{0, 1}, {1, 1}});

    }
}
