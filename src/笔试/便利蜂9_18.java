package 笔试;

import java.util.*;

/**
 * @author: Li jx
 * @date: 2020/9/18 17:02
 * @description:
 */
public class 便利蜂9_18 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        String itemStr = sc.next();
        String[] items = itemStr.split(",");
        int[][] dp = new int[items.length][money + 1];
        for (int i = 0; i < items.length; i++) {
            int item = Integer.parseInt(items[i]);
            for (int j = 0; j < money + 1; j++) {
                if (j == 0) {
                    dp[i][0] = 1;
                    continue;
                }
                if (i == 0) {
                    if (item <= j) {
                        dp[i][j] = dp[i][j - item];
                        continue;
                    }
                }
                if (i != 0 && j < item) {
                    dp[i][j] = dp[i - 1][j];
                    continue;
                }
                if (i != 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - item];
                }
            }
        }

        System.out.println(dp[items.length - 1][money]);

    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        HashSet<String> set = new HashSet<>();
//        for (int i = 0; i < size; i++) {
//            String str = sc.next();
//            String x = String.valueOf(str.charAt(0));
//            String y = String.valueOf(str.charAt(3));
//            if (set.contains(x) && set.contains(y)) {
//                System.out.println("Y");
//                System.exit(1);
//            }
//            set.add(x);
//            set.add(y);
//        }
//        System.out.println("N");
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = "";
////        while (sc.hasNextLine()) {
//            str += sc.nextLine();
////        }
//        HashSet<Integer> set = new HashSet<>();
//        str = str.replace("[", "").replace("]", "").replace(",", "");
//        HashSet<List<Integer>> rawSet = new HashSet<>();
//
//        for (int i = 0; i < str.length(); i = i + 2) {
//            int x = Integer.parseInt(String.valueOf(str.charAt(i)));
//            int y = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
//            int z = x;
//            x = Math.min(z, y);
//            y = Math.max(z, y);
//            List<Integer> list = new ArrayList<>();
//            list.add(x);
//            list.add(y);
//            rawSet.add(list);
//        }
//
//        rawSet.forEach(j -> {
//            int x = j.get(0);
//            int y = j.get(1);
//            if (set.contains(x) && set.contains(y)) {
//                System.out.println("Y");
//                System.exit(1);
//            }
//            set.add(x);
//            set.add(y);
//
//        });
//        System.out.println("N");
//    }
}
