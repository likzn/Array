package 笔试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2020/9/27 19:29
 * @description:
 */
public class GrowingIO笔试9_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int[][] res = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    res[i+1][j+1] = res[i ][j ] + 1;
                }else {
                    res[i+1][j+1] = Math.max(res[i ][j+1], res[i+1][j ]);
                }
            }
        }
        System.out.println(res[str1.length()][str2.length()]);
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
//        while (sc.hasNext()) {
//            list.add(sc.nextInt());
//        }
//        int[] res = new int[list.size()];
//        Arrays.fill(res, 1);
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < i ; j++) {
//                if (list.get(i) > list.get(j)) {
//                    res[i] = Math.max(res[i], res[j] + 1);
//                }
//            }
//        }
//        System.out.println(res[list.size() - 1]);
//    }
}
