package LeetCode.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: Li jx
 * @date: 2019/9/3 17:12
 * @description:
 */
public class Leet1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (Integer i : stones) {
            heap.add(i);
        }
        while (!heap.isEmpty()) {
            Integer stone1 = heap.poll();
            Integer stone2;
            if (heap.isEmpty()) {
                return stone1;
            }
            stone2 = heap.poll();
            if (stone1 - stone2 != 0) {
                heap.add(stone1 - stone2);
            }
        }
        return 0;
    }
}
