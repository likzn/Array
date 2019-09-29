package LeetCode.other;

import Array.Array;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author: Li jx
 * @date: 2019/9/27 14:42
 * @description:
 */
public class Leet1054 {
    public int[] rearrangeBarcodes(int[] barcodes) {
        PriorityQueue<node> queue = new PriorityQueue<>((o1, o2) -> o2.times - o1.times);
        int[] ints = new int[10001];
        for (int i = 0; i < barcodes.length; i++) {
            ints[barcodes[i]]++;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                queue.add(new node(i, ints[i]));
            }
        }
        int[] answer = new int[barcodes.length];
        int index = 0;
        while (!queue.isEmpty()) {
            node a = queue.poll();
            node b = null;
            if (!queue.isEmpty()) {
                 b = queue.poll();
            }
            answer[index++] = a.num;
            a.times--;
            if (a.times != 0) {
                queue.add(a);
            }
            if (b != null) {
                answer[index++] = b.num;
                b.times--;
                if (b.times != 0) {
                    queue.add(b);
                }
            }
        }
        return answer;
    }
    static class node{
        public node(int num, int times) {
            this.num = num;
            this.times = times;
        }

        int num;
        int times;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getTimes() {
            return times;
        }

        public void setTimes(int times) {
            this.times = times;
        }
    }
}
