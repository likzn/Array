package 笔试;

import LeetCode.DP.Lee673;

import java.util.*;

/**
 * @author: Li jx
 * @date: 2020/9/14 19:23
 * @description:
 */
public class 百度9_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] unionFind = new int[size + 1];
        for (int i = 0; i < size + 1; i++) {
            unionFind[i] = i;
        }
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String str = sc.next();
            if ("C".equals(str)) {
                int regionA = sc.nextInt();
                int regionB = sc.nextInt();
                int a = findParent(regionA, unionFind);
                int b = findSon(regionB, unionFind);
                unionFind[a] = b;
            } else {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (findParent(a, unionFind) != findParent(b, unionFind)) {
                    System.out.println(-1);
                } else {
                    int parent = findParent(a, unionFind);
                    List<Integer> list = new ArrayList<>();
                    list.add(parent);
                    int son = get(parent, unionFind, list);
                    list.add(son);
                    System.out.println(Math.abs(list.indexOf(a) - list.indexOf(b)) - 1);

                }
            }
        }
    }

    private static int findSon(int i, int[] unionFind) {
        for (int j = 0; j < unionFind.length; j++) {
            if (unionFind[j] == i && j != i) {
                return findSon(j, unionFind);
            }
        }
        return i;
    }

    private static int get(int i, int[] unionFind, List<Integer> list) {
        for (int j = 0; j < unionFind.length; j++) {
            if (unionFind[j] == i && j != i) {
                list.add(j);
                return get(j, unionFind, list);
            }
        }
        return i;
    }

    private static int findParent(int i, int[] unionFind) {
        if (unionFind[i] != i) {
            return findParent(unionFind[i], unionFind);
        }
        return i;
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder stringBuilder = new StringBuilder();
//        int group = sc.nextInt();
//        for (int i = 0; i < group; i++) {
//            int peopleSize = sc.nextInt();
//            int remainSize = sc.nextInt();
//            int[] people = new int[peopleSize];
//            int[] remain = new int[102];
//            for (int j = 0; j < remain.length; j++) {
//                remain[j] = -1;
//            }
//            List<Integer> list = new ArrayList<>();
//            remain[101] = 0;
//            Map<Integer, Integer> map = new HashMap<>();
//            for (int j = 0; j < peopleSize; j++) {
//                people[j] = sc.nextInt();
//            }
//            int size = remainSize;
//            for (int j = 0; j < remainSize; j++) {
//                remain[sc.nextInt()] = size--;
//
//            }
//
//            for (int j = 0; j < peopleSize; j++) {
//                for (int k = people[j]; k < 101 ; k++) {
//                    if (remain[k] != -1) {
//                        System.out.print(remain[k] + " ");
//                        break;
//                    }
//                }
//
//            }
//            System.out.println();
////            for (int j = 0; j < list.size(); j++) {
////                stringBuilder.append(list.get(j)).append(" ");
////            }
////            stringBuilder.append("\n");
//        }
////        System.out.println(stringBuilder.toString());
//
//    }
}
