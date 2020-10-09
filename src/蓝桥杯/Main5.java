package 蓝桥杯;

import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2019/11/21 13:22
 * @description:
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (ints[i] > ints[j]) {
                    sum ++;
                }
            }
        }
        System.out.println(sum);

    }
}
