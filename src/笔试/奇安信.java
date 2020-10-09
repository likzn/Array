package 笔试;

import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author: Li jx
 * @date: 2020/9/12 10:16
 * @description:
 */
public class 奇安信 {
    public static int maxCandies2(int[] candies, int[] coin, int n) {
        int max = 0;
        int res = Integer.MIN_VALUE;
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < coin.length; i++) {
            if (coin[i] == 0) {
                max += candies[i];
            }
        }
        for (int i = 0; i < coin.length; i++) {
            if (coin[i] == 1) {
                if (linkedList.isEmpty()) {
                    linkedList.addLast(i);
                    max += candies[i];
                } else {
                    while (!linkedList.isEmpty() && i - linkedList.getFirst() >= n) {
                        int index = linkedList.getFirst();
                        linkedList.removeFirst();
                        max -= candies[index];
                    }
                    linkedList.addLast(i);
                    max += candies[i];
                    res = Math.max(max, res);
                }
            }
        }
        res = Math.max(max, res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxCandies2(new int[]{3, 5, 7, 2, 8, 8, 15, 3},
                new int[]{1, 0, 1, 0, 1, 0, 1, 0}, 3));
    }
}
