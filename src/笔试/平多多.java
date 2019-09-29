package 笔试;

import java.util.*;

/**
 * @author: Li jx
 * @date: 2019/9/25 15:11
 * @description:
 */
public class 平多多 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] ints = new int[n];
//        for (int i = 0; i < n; i++) {
//            ints[i] = sc.nextInt();
//        }
//        Arrays.sort(ints);
//        int a = 0;
//        int b = 2 * m - 1;
//        long sum = 0;
//        while (a < b) {
//            sum = sum + ints[a] * ints[b];
//            a++;
//            b--;
//        }
//        System.out.println(sum);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] ints = new int[n+1];
//        int sum = 0;
//        for (int i = 0; i < m; i++) {
//            int left = sc.nextInt();
//            int right = sc.nextInt();
//
//            for (int j = left; j <= right; j++) {
//                if (ints[j] == 0) {
//                    sum++;
//                    ints[j]++;
//                }
//            }
//            System.out.println(sum);
//        }
        Scanner scanner = new Scanner(System.in);
        int aNum = scanner.nextInt();
        int bNum = scanner.nextInt();
        int k = scanner.nextInt();
        List set = new ArrayList();
        dfs(aNum, bNum, k,"",set);
    }

    public static void dfs(int a, int b, int k,String str,List set) {
        if (a == -1 || b == -1) {
            return;
        }
        if (set.size() == k) {
            System.out.println(set.get(k - 1));
        }
        if (!"".equals(str)) {
            set.add(str);
        }
        dfs(a - 1, b, k - 1, str + "a",set);

        dfs(a, b - 1, k - 1, str + "b",set);

    }
}
