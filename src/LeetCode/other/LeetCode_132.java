package LeetCode.other;

import Array.Array;

import java.util.Arrays;

/**
 * @auther: Li jx
 * @date: 2019/4/16 20:01
 * @description:
 */
public class LeetCode_132 {
//    public int minCut(String s) {
//        int[] ints = get(s);
//        int i = ints.length-1;
//        Arrays.sort(ints);
//        int sum = 0;
//        while (sum < s.length()) {
//            sum += ints[i--];
//        }
//    }




    public static int[] get(String s) {
        int center = 0;
        int rightSide = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@");
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            stringBuilder.append("@");
        }
        String newString = stringBuilder.toString();
        int[] ints = new int[newString.length()];
        for (int i = 0; i < newString.length(); i++) {
            int left = 2 * center - i;
            if (rightSide > i) {
                if (ints[left]+i<rightSide) {
                    ints[i] = ints[left];
                    continue;
                } else {
                    ints[i] = rightSide - i;
                }
            }

            while (i - ints[i] >= 0 && i + ints[i] < newString.length()) {
                if (newString.charAt(i - ints[i]) == newString.charAt(i + ints[i])) {
                    ints[i]++;
                } else {
                    break;
                }
            }
            center = i;
            rightSide = center + ints[i] ;
        }
        return ints;
    }
}
