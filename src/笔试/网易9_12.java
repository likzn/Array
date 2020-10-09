package 笔试;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: Li jx
 * @date: 2020/9/12 15:11
 * @description:
 */
public class 网易9_12 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] all = new int[10000];
//        String[] boyStr = sc.nextLine().split(" ");
//        String[] girlStr = sc.nextLine().split(" ");
//        if (boyStr.length - 5 > 0) {
//            System.out.println(boyStr.length-5);
//        }else {
//            System.out.println(boyStr.length);
//        }
//
//
//        for (int i = 0; i < boyStr.length; i++) {
//
//        }
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int x = sc.nextInt();
//        int[] ints = new int[size - 1];
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < size - 1; i++) {
//            ints[i] = sc.nextInt();
//            map.put(i + 1, ints[i]);
//        }
//        int max = 0;
//        for (int i = 1; i < size; i++) {
//            int length = 0;
//            int a = i;
//            while (map.containsKey(a)) {
//                length++;
//                a = map.get(a);
//            }
//            max = Math.max(max, length + 1);
//
//        }
//        System.out.println(Math.min(max, x + 1));
//
//    }
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int x = sc.nextInt();
        int[] ints = new int[size - 1];
        for (int i = 0; i < size - 1; i++) {
            ints[i] = sc.nextInt();
        }
        dfs(ints, x, 0, new HashSet<>());
        System.out.println(max);
    }

    private static void dfs(int[] ints, int x, int value, Set<Integer> set) {
        if (x == 0) {
            max = Math.max(max, set.size() + 1);
            return;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) {
                if (!set.contains(value)) {
                    set.add(value);
                    dfs(ints, x - 1, i + 1, set);
                    set.remove(set.size() - 1);
                }
            }
        }
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        HashSet<Character> set = new HashSet<>();
//        set.add('a');
//        set.add('b');
//        set.add('c');
//        set.add('x');
//        set.add('y');
//        set.add('z');
//
//        int max = 0;
//        for (int i = 0; i < str.length(); i++) {
//            HashMap<Character, Integer> map = new HashMap<>();
//            for (int j = i; j < str.length(); j++) {
//                char z = str.charAt(j);
//                if (set.contains(z)) {
//                    if (!map.containsKey(z)) {
//                        map.put(z, 1);
//                    } else {
//                        map.put(z, map.get(z) + 1);
//                    }
//                    AtomicBoolean flag = new AtomicBoolean(true);
//                    map.values().forEach(e -> {
//                        if (e % 2 == 1) {
//                            flag.set(false);
//                        }
//                    });
//                    if (flag.get()){
//                        max = Math.max(max, j - i + 1);
//                    }
//                }
//            }
//        }
//        System.out.println(max);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int point = sc.nextInt();
//        int edge = sc.nextInt();
//        AtomicInteger size = new AtomicInteger();
//        HashSet<Integer> set = new HashSet<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < edge; i++) {
//            int father = sc.nextInt();
//            sc.next();
//            int son = sc.nextInt();
//            set.add(father);
//            map.put(son, father);
//        }
//        set.forEach(key -> {
//            AtomicBoolean flag = new AtomicBoolean(true);
//            AtomicInteger valueSize = new AtomicInteger();
//            map.keySet().forEach(mapKey -> {
//                if (map.containsKey(mapKey) && map.get(mapKey).equals(key)) {
//                    valueSize.getAndIncrement();
//                    if (set.contains(mapKey)) {
//                        flag.set(false);
//                    }
//                }
//            });
//            if ((valueSize.get() == 2) && flag.get()) {
//                size.getAndIncrement();
//            }
//        });
//        System.out.println(size.get());
//    }
}
