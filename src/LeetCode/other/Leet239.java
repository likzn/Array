package LeetCode.other;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author: Li jx
 * @date: 2019/9/28 12:25
 * @description:
 */
public class Leet239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<PriorityQueue> list = new ArrayList<>();
        int[] answer = new int[nums.length - k + 1];
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        list.add(new PriorityQueue());
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
            list.add(queue);
        }
        for (int i = queue.size()-1; i >= k; i--) {
            list.get(i).removeAll(list.get(i - k));
            answer[i] = (int) list.get(i).peek();
        }
        return answer;
    }
}
