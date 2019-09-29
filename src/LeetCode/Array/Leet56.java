package LeetCode.Array;

import LeetCode.DP.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/22 14:18
 * @description:
 */
public class Leet56 {
    //    public int[][] merge(int[][] intervals) {
//        List<Integer> list = new ArrayList<>();
//        int[] ints = new int[1000];
//        for (int i = 0; i < intervals.length; i++) {
//            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
//                ints[j]++;
//            }
//        }
//        boolean flag = false;
//        for (int i = 0; i < ints.length; i++) {
//            if (!flag && ints[i] != 0) {
//                list.add(i);
//                flag = true;
//            }
//            if (flag && ints[i] == 0) {
//                list.add(i - 1);
//                flag = false;
//            }
//        }
//        int[][] ints1 = new int[list.size() / 2][2];
//        for (int i = 0; i < list.size(); i = i + 2) {
//            ints1[i / 2][0] = list.get(i);
//            ints1[i / 2][1] = list.get(i + 1);
//        }
//        return ints1;
//    }


}
