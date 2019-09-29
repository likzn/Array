package 笔试;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2019/9/19 18:47
 * @description:
 */
public class 滴滴 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] ints = new int[n+1];
//        for (int i = 0; i < m; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            ints[a] ++;
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int range = sc.nextInt();
        int[] ints = new int[n + 1 + n];
        int[] ints1 = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            int a = sc.nextInt();
            ints[i] = ints[i - 1] + a;
            ints1[i] = a;
        }
        for (int i = n + 1; i < n + 1 + n; i++) {
            ints[i] = ints[i - n] + ints1[i-n];
        }
        int min = Integer.MAX_VALUE;
        for (int i = range; i < n + 1 + n; i++) {
            if (min > ints[i] - ints[i - range]) {
                min = ints[i] - ints[i - range];
            }
        }
        System.out.println(min);
    }
}
