package LeetCode.Heap;

import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * @auther: Li jx
 * @date: 2019/4/23 14:47
 * @description:
 */
public class Leet973 {
    public int[][] kClosest(int[][] points, int K) {
        int[] ints = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            ints[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        }
        PriorityQueue<Integer> queue = new PriorityQueue(
                (a, b) -> ints[(int) b] - ints[(int) a]
        );
        for (int i = 0; i < points.length; i++) {
            if (queue.size() < K) {
                queue.add(i);
            } else if (ints[queue.peek()] > ints[i]) {
                queue.remove();
                queue.add(i);
            }
        }
        int[][] a = new int[K][];
        for (int i = 0; i < K; i++) {
            a[i] = points[queue.remove()];

        }
        return a;
    }

    public static void main(String[] args) {
        new Leet973().kClosest(new int[][]{{3, 3}, {5, 1}, {-2, 4}}, 2);
    }
}


