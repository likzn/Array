package LeetCode.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/28 10:39
 * @description:
 */
public class Leet984 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        List<int[]> list = new ArrayList();
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return (int[][]) list.toArray();
    }

}
