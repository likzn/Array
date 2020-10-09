package 笔试;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2020/9/12 19:00
 * @description:
 */
public class 科大讯飞9_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] ints = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ints[i][j] = sc.nextInt();
            }
        }

        Arrays.sort(ints);
        System.out.println(ints[row - 1][col - 2]*ints[row - 2][col - 1]);
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] res = new int[size];
//        for (int i = 0; i < size; i++) {
//            res[i] = sc.nextInt();
//        }
//        Arrays.sort(res);
//        for (int i = 0; i < size; i++) {
//            System.out.println(res[i]);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int length = 0;
//        while (num != 0) {
//            num = num & (num - 1);
//            length++;
//        }
//        System.out.println(length);
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//        int leftMove = sc.nextInt();
//        word += word;
//        leftMove = leftMove % (word.length() / 2);
//        System.out.println(word.substring(leftMove, leftMove + word.length() / 2));
//    }


}
