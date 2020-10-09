package 笔试;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: Li jx
 * @date: 2020/9/6 20:04
 * @description:
 */
public class 腾讯9_6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int K = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String s = sc.next();
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        Set<Integer> set = new HashSet<>(map.values());
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int k = K;
        for (int i = list.size() - 1; i >= 0; i--) {
            int valueSize = list.get(i);
            List<String> list1 = new ArrayList<>();
            map.forEach((key, value) -> {
                if (valueSize == value) {
                    list1.add(key);
                }
            });
            Collections.sort(list1);
            if (list1.size() <= k) {
                k = k - list1.size();
                for (int j = 0; j < list1.size(); j++) {
                    System.out.println(list1.get(j) + " " + valueSize);
                }
            } else {
                for (int j = 0; j < k; j++) {
                    System.out.println(list1.get(j) + " " + valueSize);
                }
            }
        }

        k = K;
        for (int valueSize : list) {
            List<String> list1 = new ArrayList<>();
            map.forEach((key, value) -> {
                if (valueSize == value) {
                    list1.add(key);
                }
            });
            Collections.sort(list1);
            if (list1.size() <= k) {
                k = k - list1.size();
                for (int j = 0; j < list1.size(); j++) {
                    System.out.println(list1.get(j) + " " + valueSize);
                }
            } else {
                for (int j = 0; j < k; j++) {
                    System.out.println(list1.get(j) + " " + valueSize);
                }
            }
        }

    }
}
