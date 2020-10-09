package 笔试;

import java.util.*;

/**
 * @author: Li jx
 * @date: 2020/9/6 10:06
 * @description:
 */
public class Main {

//    public static void main(String args[]) {
//        Scanner cin = new Scanner(System.in);
//        int size = cin.nextInt();
//        int res = 0;
//        for (int i = 1; i < size + 1; i++) {
//            int a = cin.nextInt();
//            for (int j = 1; j < i ; j++) {
//                res = res ^ (i % j);
//            }
//            if (size > i) {
//                res = res ^ (size - i) % 2 * i;
//            }
//            res = res ^ a;
//        }
//        System.out.println(res);
//    }

//    public static void main(String args[]) {
//        Scanner cin = new Scanner(System.in);
//
//        while (cin.hasNext()) {
//            int size = cin.nextInt();
//            int floorNum = (int) (Math.sqrt(size) + 1);
//            int total = 0;
//            boolean noFlag = false;
//            for (int i = 0; i < size; i++) {
//                int sonNum = cin.nextInt();
//                total += sonNum;
//                if (sonNum % 2 == 0) {
//                    noFlag = true;
//                }
//            }
//
//            if (size % 2 == 0 || noFlag) {
//                System.out.println("NO");
//            } else {
//                int all = size;
//                for (int i = 0; i < floorNum-1; i++) {
//                    size = size - (int) Math.pow(2, i);
//                    all += size;
//                }
//                if (all == total) {
//                    System.out.println("YES");
//                } else {
//                    System.out.println("NO");
//
//                }
//            }
//        }
//    }

    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int size = cin.nextInt();
        LinkedHashMap<Integer, Integer> lru =
                new LinkedHashMap<>(100000, (float) 0.75, true);
        for (int i = 0; i < size; i++) {
            int a = cin.nextInt();
            if (lru.containsKey(a)) {
                lru.get(a);
            } else {
                lru.put(a, a);
            }

        }
        List<Integer> res = new ArrayList<>();
        lru.forEach((key, value) -> {
            res.add(key);

        });

        for (int i = res.size()-1; i >= 0; i--) {
            System.out.println(res.get(i));
        }

    }
}
