package LeetCode.剑指offer;

import java.util.ArrayList;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (left <= right && top <= down) {
            for (int i = left; i <= right && top <= down; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= down && left <= right; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= left && top <= down; i--) {
                list.add(matrix[down][i]);
            }
            down--;
            for (int i = down; i >= top && left <= right; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }

    public static void main(String[] args) {
        new Offer19().printMatrix(new int[][]{{1}, {2}, {3}, {4}, {5}});
    }
}
