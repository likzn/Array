package LeetCode.DP;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2019/11/15 09:56
 * @description:
 */
public class Exp {
    public static int dp1(int[] weight, int[] value, int bag) {
        int[][] dp = new int[weight.length][bag + 1];
        for (int i = 0; i < weight.length; i++) {
            for (int j = bag; j >= 0; j--) {
                int thisWeight = weight[i];
                if (i == 0 && j >= thisWeight) {
                    dp[i][j] = dp[i][j - thisWeight] + value[i];
                }
                if (i != 0 && j >= thisWeight) {
                    dp[i][j] = Math.max(dp[i - 1][j - thisWeight] + value[i], dp[i - 1][j]);
                }
            }
        }
        return dp[weight.length - 1][bag];
    }

    public static double dp2(int[] weight, int[] value, int bag) {
        double[] count = new double[weight.length];
        double[] dp = new double[weight.length];
        for (int i = 0; i < weight.length; i++) {
           dp[i] =(double) value[i] / weight[i];
        }
        double sum = 0;
        while (true){
            double max = Integer.MIN_VALUE;
            int index = -1;
            for (int j = 0; j < dp.length; j++) {
                if (max < dp[j]) {
                    index = j;
                    max = dp[j];
                }
            }

            if (bag >= weight[index]) {
                bag -= weight[index];
                sum += value[index];
                dp[index] = -1;
                count[index] = 1;
            } else {
                sum += dp[index] * bag;
                dp[index] = -1;
                count[index] = (double)bag / weight[index];
                break;
            }
        }
        System.out.println("放的物品（1为全放，小数为放部分）" );
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + ",");
        }
        System.out.println();
        System.out.println("总共能放的长度为" + sum);
        return sum;
    }
    public static void main(String[] args) {
//        int[] weight = new int[]{5, 2, 6, 3, 4, 7};
//        int[] value = new int[]{10, 12, 9, 8, 15, 18};
//        int bag = 15;
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int bag = sc.nextInt();
        int[] weight = new int[length];
        int[] value = new int[length];
        for (int i = 0; i < length; i++) {
            weight[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            value[i] = sc.nextInt();
        }
        dp2(weight, value, bag);
    }
}
