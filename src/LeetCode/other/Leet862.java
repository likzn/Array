package LeetCode.other;

import java.util.HashMap;

/**
 * @author: Li jx
 * @date: 2019/9/10 16:25
 * @description:
 */
public class Leet862 {
//    public int shortestSubarray(int[] A, int K) {
//        int[] ints = new int[A.length + 1];
//        ints[0] = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(0, 0);
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < A.length; i++) {
//            ints[i + 1] = ints[i] + A[i];
//            if (map.containsKey(ints[i + 1] - K)) {
//                min = Math.min(min, i + 1 - map.get(ints[i + 1] - K));
//            }
//            map.put(ints[i + 1], i + 1);
//        }
//        return min == Integer.MAX_VALUE ? -1 : min;
//    }
//
//    public static void main(String[] args) {
//        new Leet862().shortestSubarray(new int[]{2, -1, 2}, 3);
//    }
}
