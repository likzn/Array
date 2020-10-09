package 蓝桥杯;

import Array.Array;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2019/11/21 12:57
 * @description:
 */
public class Main1 implements Serializable {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int length = s.length();
//        int sum = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                sum++;
//            }
//        }
//        System.out.println(sum);
//        System.out.println(length - sum);
//    }

    public static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        long num = -1;
        Scanner input = new Scanner(System.in);
        /**
         * 判断数据的正确性
         */
        do {
            System.out.println("请输入一个正整数：");
            try {
                num = input.nextInt();
            } catch (Exception e) {
                input.nextLine();
                System.out.println("输入错误，请重新输入!!");
            }
        } while (num < 0);
        String string = Long.toString(num);
        String[] strings = string.split("");

        //调用函数，实现对list的填充所有的排列组合情况
        getRandom(strings, 0, strings.length - 1);

        //打印输出所有情况
        System.out.println("一共有" + list.size() + "种不同的排列,分别是:");
        System.out.println();
    }

    public static void getRandom(String[] strings, int start, int end) {
        StringBuffer sBuffer = new StringBuffer();
        String string = null;
        /*
         * 一种排列情况已经出来了
         */
        if (start == end) {
            for (int i = 0; i <= end; i++) {
                sBuffer.append(strings[i]);
            }
            string = sBuffer.toString();
            //判断该组合情况是否已经存在，如果不存在就添加该情况
            if (!list.contains(string)) {
                list.add(string);
            }
        } else {
            for (int i = start; i <= end; i++) {
                String temp = strings[start];
                strings[start] = strings[i];
                strings[i] = temp;

                //递归调用，直到start==end时表示递归结束
                getRandom(strings, start + 1, end);

                temp = strings[start];
                strings[start] = strings[i];
                strings[i] = temp;
            }
        }
    }
}
