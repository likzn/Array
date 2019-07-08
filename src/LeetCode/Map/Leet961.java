package LeetCode.Map;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @auther: Li jx
 * @date: 2019/4/21 19:47
 * @description:
 */
public class Leet961 {
    public int repeatedNTimes(int[] A) {
        TreeMap<Integer, Integer> treeMap = new TreeMap();
        for (int i = 0; i < A.length; i++) {
            if (!treeMap.containsKey(A[i])) {
                treeMap.put(A[i], 1);
            } else {
                treeMap.put(A[i], treeMap.get(A[i] + 1));
                if (treeMap.get(A[i]) == A.length / 2) {
                    return A[i];
                }
            }
        }
        return 0;
    }
}
