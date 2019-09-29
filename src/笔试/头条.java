package 笔试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2019/9/15 16:14
 * @description: 1.8
 */
public class 头条 {
    //1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int length = sc.nextInt();
//        int[] ints = new int[length];
//        for(int i = 0; i <length; i++){
//            ints[i] = sc.nextInt();
//        }
//        int sum = 0;
//        int limit = sc.nextInt();
//        Arrays.sort(ints);
//        for (int i = 0; i < length; i++) {
//            int left = i + 1;
//            int right = length - 1;
//            while (left < right) {
//                if (ints[i] + ints[left] + ints[right] >= limit) {
//                    right--;
//                } else {
//                    sum += right - left;
//                    left++;
//                }
//            }
//        }
//        System.out.println(sum);
//    }
    //2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] ints = new int[length];
        for(int i = 0; i <length; i++){
            ints[i] = sc.nextInt();
        }
        int sum = 0;
        Arrays.sort(ints);
        if ((length & 1) == 1) {
            for (int i = 0; i < length / 2 + 1; i++) {
                sum += ints[i];
            }
            System.out.println(sum);
        } else {
            int allSum = 0;
            for (int i = 0; i < length; i++) {


                allSum += ints[i];
            }
            for (int i = length-1; i >= length-length / 2+1; i--) {
                sum += ints[i];
            }
            for (int i = 0; i < length; i++) {
                if (sum + ints[i] >= allSum / 2) {
                    sum += ints[i];
                    break;
                }
            }
            System.out.println(sum);
        }

    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double max = Integer.MIN_VALUE;
//        double length = sc.nextInt();
//        double allSum = 0;
//
//        length--;
//        double time = sc.nextInt();
//        double lastTime = time;
//        double fileNum = sc.nextInt();
//        allSum += fileNum;
//        max = Math.max(max, allSum);
//
//
//        while (length-- != 0) {
//            time = sc.nextInt();
//            fileNum = sc.nextInt();
//
//            allSum += fileNum;
//            allSum = allSum - time + lastTime;
//            max = Math.max(max, allSum);
//            lastTime = time;
//        }
//
//        System.out.println((lastTime + allSum) + " " + max);
//    }
}
