package 蓝桥杯;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2019/11/21 13:22
 * @description:
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        int row = sc.nextInt();
        int[][] ints = new int[column][row];
        int top = 0;
        int down = column-1;
        int left = 0;
        int right = row - 1;
        int num = 1;
        while (left <= right && top <= down) {
            for (int i = left; i <= right && top <= down; i++) {
                ints[top][i] = num++;
            }
            top++;
            for (int i = top; i <= down && left <= right; i++) {
                ints[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left && top <= down; i--) {
                ints[down][i] = num++;
            }
            down--;
            for (int i = down; i >= top && left <= right; i--) {
                ints[i][left] = num++;
            }
            left++;
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(ints[a-1][b-1]);

    }
}
