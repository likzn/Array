package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/9/19 15:31
 * @description: 没写出来
 */
public class Leet240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {

            return false;
        }
        int left = 0;
        int right = matrix[0].length-1;
        int yes = 0;
        while (left < right) {
            int index = left + (right - left) / 2;
            if (target == matrix[0][index]) {
                return true;
            }
            if (matrix[0][index] > target) {
                right = index-1;
            } else {
                left = index+1;
            }
            if (left == right) {
                yes = left;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][yes] == target) {
                return true;
            }
            if (yes-1>=0&&matrix[i][yes-1] == target) {
                return true;
            }
            if (yes+1<matrix[0].length&&matrix[i][yes+1] == target) {
                return true;
            }
        }
        return false;
    }
}
