package LeetCode.other;

import java.util.PriorityQueue;

/**
 * @author: Li jx
 * @date: 2019/9/6 16:48
 * @description:
 */
public class Leet1079 {
    int sum = 0;

    public int numTilePossibilities(String tiles) {
        int[] ints = new int[26];
        for (int i = 0; i < tiles.length(); i++) {
            ints[tiles.charAt(i) - 'A']++;
        }
        dfs(tiles, ints);
        return sum;
    }

    public void dfs(String tiles, int[] ints) {
        int[] newInt = ints.clone();
        for (int i = 0; i < tiles.length(); i++) {
            if (newInt[tiles.charAt(i) - 'A'] == 0) {
                continue;
            }
            newInt[tiles.charAt(i) - 'A']--;
            sum++;
            dfs(tiles, newInt);
        }
    }

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(5);
        System.out.println(queue.size());
    }
}
