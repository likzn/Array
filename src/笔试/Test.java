package 笔试;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: Li jx
 * @date: 2019/9/21 15:35
 * @description:
 */
public class Test {
    public static int numberofprize(int a, int b, int c) {
        int res = 0;
        int[] ints = new int[3];
        ints[0] = a;
        ints[1] = b;
        ints[2] = c;
        while (true) {
            Arrays.sort(ints);
            while (ints[0] >= 1) {
                res++;
                ints[0]--;
                ints[1]--;
                ints[2]--;
            }
            if (ints[1] + ints[2] <= 4) {
                break;
            }
            if (ints[2] - ints[1] == 0) {
                int x = ints[2] / 2;
                res += x;
                ints[2] -= 2 * x;
                ints[1] -= 2 * x;
            }
            if (ints[2] - ints[1] != 1) {
                int x = (ints[2] - ints[1]) / 2;
                ints[2] = ints[2] - (ints[2] - ints[1]) / 2;
                res += x;
                ints[2] -= x;
                ints[1] -= x;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(numberofprize(4, 4, 2));
    }

    static Set<String> set = new HashSet<>();


    public static void dfs(String password, String s, int index) {
        if (s.length() == password.length()) {
            set.add(s);
            return;
        }

        int last = Integer.parseInt(String.valueOf(s.charAt(s.length() - 1)));
        int indexNum = Integer.parseInt(String.valueOf(password.charAt(index)));
        int next = (last + indexNum) / 2;
        if ((last + indexNum) % 2 == 1) {
            dfs(password, s + (next + 1), index + 1);
        }
        dfs(password, s + next, index + 1);

    }


    public int getHouses(int t, int[] xa) {
        if (xa.length == 0) {
            return 0;
        }
        Double[] doubles = new Double[xa.length];
        for (int i = 0; i < xa.length; i++) {
            doubles[i] = (double) xa[i];
        }
        AtomicInteger res = new AtomicInteger(2);
        Map<Double, Double> map = new HashMap<>();
        for (int i = 0; i < xa.length; i = i + 2) {
            if (i + 2 < xa.length) {
                map.put(doubles[i] + doubles[i + 1] / 2, doubles[i + 2] - doubles[i + 2] / 2);
            }
        }
        map.forEach((key, value) -> {
            if (value - key > t) {
                res.addAndGet(2);
            }
            if (value - key == t) {
                res.addAndGet(1);
            }
        });

        return res.get();
    }
}
