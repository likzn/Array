package 蓝桥杯;

import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2019/11/21 13:22
 * @description:
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = sc.nextInt();
        }
        long num = 0;
        for (int i = 1; i < size; i++) {
            int a = i;
            while (a != 0) {
                a--;
                if (ints[a] > ints[i]) {
                    num += i - a;
                    break;
                }
            }
        }
        System.out.println(num);

    }
}
