package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @auther: Li jx
 * @date: 2019/4/22 20:47
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        int n = 1000000;
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            maxHeap.add(random.nextInt(Integer.MAX_VALUE));
        }
        List<Integer> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(maxHeap.extractMax());
        }
        for (int i = 1; i < n; i++) {
            if (list.get(i - 1) >= list.get(i)) {
                continue;
            }
            System.out.println(" qq");
        }
        System.out.println("complete");
    }
}
