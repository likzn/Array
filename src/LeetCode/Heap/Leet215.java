package LeetCode.Heap;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * @auther: Li jx
 * @date: 2019/4/23 14:47
 * @description:
 */
public class Leet215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();


        for (int i = 0; i < nums.length; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(nums[i]);
            } else if (nums[i] >= priorityQueue.peek()) {
                priorityQueue.remove();
                priorityQueue.add(nums[i]);
            }
        }
        return priorityQueue.remove();
    }

    public static void main(String[] args) {
        new Leet215().findKthLargest(new int[]{-2, 1, 0}, 2);
    }
}
