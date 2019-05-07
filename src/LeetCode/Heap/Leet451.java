package LeetCode.Heap;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @auther: Li jx
 * @date: 2019/4/23 14:47
 * @description:
 */
public class Leet451 {
    public String frequencySort(String s) {
        TreeMap<Character, Integer> treeMap = new TreeMap();
        char[] c = s.toCharArray();
        for (char q : c) {
            if (!treeMap.containsKey(q)) {
                treeMap.put(q, 1);
            } else {
                treeMap.put(q, treeMap.get(q) + 1);
            }
        }
        PriorityQueue<Character> queue = new PriorityQueue(
                (a, b) -> treeMap.get(b) - treeMap.get(a)
        );
        Iterator<Character> iterator = treeMap.keySet().iterator();
        while (iterator.hasNext()) {
            queue.add(iterator.next());
        }
        StringBuilder sb = new StringBuilder();
        Character w;
        while (queue.peek() != null) {
            w = queue.remove();
            int loopSize = treeMap.get(w);
            for (int i = 0; i < loopSize; i++) {
                sb.append(w);
            }
        }
        return sb.toString();

    }
}
