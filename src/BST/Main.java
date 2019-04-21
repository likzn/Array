package BST;

import LeetCode.LinkedList.link707;

import java.util.ArrayList;
import java.util.Random;

/**
 * @auther: Li jx
 * @date: 2019/4/17 18:15
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        int n = 1000;
        BST bst = new BST();
        ArrayList list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            bst.add(random.nextInt(10000));
        }
        while (!bst.isEmpty()) {
            list.add(bst.rmMin());
        }

        System.out.println(list);

        for (int i = 0; i < n; i++) {
            bst.add(random.nextInt(10000));
        }
        while (!bst.isEmpty()) {
            list.add(bst.rmMax());
        }

        System.out.println(list);

    }

}
