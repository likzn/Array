package 笔试;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: Li jx
 * @date: 2020/9/13 19:18
 * @description:
 */
public class 滴滴9_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        for (int i = 0; i < group; i++) {
            int size = sc.nextInt();
            int edge = sc.nextInt();
            int everyNeed = sc.nextInt();
            int[] unionFind = new int[size + 1];
            for (int j = 0; j < unionFind.length; j++) {
                unionFind[j] = j;
            }
            for (int j = 0; j < edge; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int need = sc.nextInt();
                if (need <= everyNeed) {
                    int a1 = findParent(a, unionFind);
                    int b1 = findParent(b, unionFind);
                    if (a1 != b1) {
                        unionFind[a1] = b1;
                    }
                }
            }
            Set<Integer> set = new HashSet<>();
            for (int k = 1; k < unionFind.length; k++) {
                set.add(findParent(k, unionFind));
            }
            if (set.size() == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

    private static int findParent(int i, int[] unionFind) {
        if (unionFind[i] != i) {
            i = findParent(unionFind[i], unionFind);
        }
        return i;
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int length = Integer.parseInt(sc.nextLine());
//        String sourceStr = sc.nextLine();
//        int left = 0;
//        int right = 0;
//        while (right < sourceStr.length()) {
//            left = right;
//            right += length;
//
//            System.out.print(
//                    new StringBuilder(sourceStr.substring(left, Math.min(right, sourceStr.length()))
//                    ).reverse().toString()
//            );
//
//        }
//
//    }
}
