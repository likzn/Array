package 笔试;

import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2019/9/25 20:03
 * @description:
 */
public class 搜狐畅游 {
    private static Object object = new Object();
    private static volatile int number = 1;
    private static volatile char c = 'A';


    public static void main(String[] args) throws InterruptedException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] ints = new int[n];
//        for (int i = 0; i < n; i++) {
//            int left = sc.nextInt();
//            int right = sc.nextInt();
//            m = m - left;
//            right = right - left;
//            ints[i] = right;
//        }
//        int[][] dp = new int[n][m + 1];
//        for (int i = 0; i < n; i++) {
//            dp[i][0] = 1;
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < m + 1; j++) {
//                if (i == 0 ) {
//                    if (j <= ints[i]) {
//                        dp[i][j] = 1;
//                    }
//                } else {
//                    int times = 0;
//                    while (j - times >= 0) {
//                        dp[i][j] = dp[i][j] + dp[i - 1][j - times];
//                        if (times == ints[i]) {
//                            break;
//                        }
//                        times++;
//                    }
//                }
//            }
//        }
//        System.out.println(dp[n - 1][m]);
        new ThreadB().start();

    }

    static class ThreadA extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (object) {
                    System.out.print(number);
                    number++;
                    System.out.print(number);
                    number++;
                    System.out.print(c + " ");
                    c++;
                    if (c > 'Z'-1) {
                        break;
                    }
                }
            }
        }
    }

    static class ThreadB extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (object) {
                    System.out.print(number);
                    number++;
                    System.out.print(number);
                    number++;
                    System.out.print(c + " ");
                    c++;
                    if (c > 'Z' -1) {
                        break;
                    }
                }
            }
        }
    }


}
