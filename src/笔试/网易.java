package 笔试;

import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2019/9/21 14:59
 * @description: 100 80 100 60
 */
public class 网易 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int size = in.nextInt();
//        while (size-- != 0) {
//            int x = in.nextInt();
//            StringBuilder stringBuilder = new StringBuilder();
//            while (x > 9) {
//                stringBuilder.append(9);
//                x -= 9;
//            }
//            stringBuilder.append(x);
//            System.out.println(stringBuilder.reverse().toString());
//        }

//        Scanner in = new Scanner(System.in);
//        int size = in.nextInt();
//        while (size-- != 0) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int p = in.nextInt();
//            int q = in.nextInt();
//            System.out.println(dfs(a, b, p, q, 0));
//        }
//
//    }
//
//    public static int dfs(int a, int b, int p, int q,int time) {
//        if (a +p>= b) {
//            return time+1;
//        }
//        if (a + p * q >= b) {
//            return time + 2;
//        }
//        if (a + p * q * q >= b) {
//            return time + 3;
//        }
//        return Math.min(dfs(a + p, b, p, q, time + 1), dfs(a, b, p * q, q, time + 1));

//        Scanner in = new Scanner(System.in);
//        int size = in.nextInt();
//        while (size-- != 0) {
//            int length = in.nextInt();
//            int[] num = new int[length];
//            long[] sum = new long[length + 1];
//            for (int i = 0; i < length; i++) {
//                num[i] = in.nextInt();
//            }
//            for (int i = 1; i < length + 1; i++) {
//                sum[i] =sum[i-1]+ num[i - 1];
//            }
//            int max = 1;
//            for (int i = 0; i < length; i++) {
//                int j = 1;
//                for (int k = i + 1; k < length; k++) {
//                    if (sum[k] - sum[i] > num[k]) {
//                        max = Math.max(max,j);
//                        break;
//                    } else {
//                        j++;
//                    }
//                }
//            }
//            System.out.println(max);
//        }

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
                    sum += j - i;
                }
            }
        }
        System.out.println(sum);

    }
}
