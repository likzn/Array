package LeetCode.Heap;

import java.util.*;

/**
 * @auther: Li jx
 * @date: 2019/4/23 14:47
 * @description:
 */
public class Leet347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        PriorityQueue<Integer> queue = new PriorityQueue(
                (a, b) -> map.get(a) - map.get(b)
        );
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (queue.size() < k) {
                queue.add(a);
            } else if (map.get(queue.peek()) <map.get(a) ) {
                queue.remove();
                queue.add(a);
            }
        }
        List list = new ArrayList();
        while (queue.peek() != null) {
            list.add(queue.remove());
        }
        return list;
    }

}


