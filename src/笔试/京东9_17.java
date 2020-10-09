package 笔试;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author: Li jx
 * @date: 2020/9/17 19:11
 * @description:
 */
public class 京东9_17 {

    //    static boolean res = false;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int group = sc.nextInt();
//        for (int i = 0; i < group; i++) {
//            res = false;
//            int row = sc.nextInt();
//            int col = sc.nextInt();
//            int sRow = 0;
//            int sCol = 0;
//            int eRow = 0;
//            int eCol = 0;
//            int[][] ints = new int[row][col];
//            for (int j = 0; j < row; j++) {
//                String c = sc.next();
//                for (int k = 0; k < c.length(); k++) {
//                    char x = c.charAt(k);
//                    if ('.' == (x)) {
//                        ints[j][k] = 0;
//                    }
//                    if ('#' == (x)) {
//                        ints[j][k] = 1;
//                    }
//                    if ('S' == (x)) {
//                        ints[j][k] = 2;
//                        sRow = j;
//                        sCol = k;
//                    }
//                    if ('E' == (x)) {
//                        ints[j][k] = 3;
//                        eRow = j;
//                        eCol = k;
//                    }
//                }
//            }
//            dfs(ints, sRow, sCol, eRow, eCol);
//            if (res) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//
//            }
//
//        }
//    }
//
//    private static void dfs(int[][] ints, int sRow, int sCol, int eRow, int eCol) {
//        if (sRow == eRow && sCol == eCol) {
//            res = true;
//        }
//        int row = ints.length;
//        int col = ints[0].length;
//        if (sRow + 1 < row && ints[sRow + 1][sCol] != 1) {
//            ints[sRow][sCol] = 1;
//            dfs(ints, sRow + 1, sCol, eRow, eCol);
//            ints[sRow][sCol] = 0;
//        }
//        if (sRow - 1 >= 0 && ints[sRow - 1][sCol] != 1) {
//            ints[sRow][sCol] = 1;
//            dfs(ints, sRow - 1, sCol, eRow, eCol);
//            ints[sRow][sCol] = 0;
//        }
//        if (sCol + 1 < col && ints[sRow][sCol + 1] != 1) {
//            ints[sRow][sCol] = 1;
//            dfs(ints, sRow, sCol + 1, eRow, eCol);
//            ints[sRow][sCol] = 0;
//        }
//        if (sCol - 1 >= 0 && ints[sRow][sCol - 1] != 1) {
//            ints[sRow][sCol] = 1;
//            dfs(ints, sRow, sCol - 1, eRow, eCol);
//            ints[sRow][sCol] = 0;
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length() - 3; i++) {
            String s = str.substring(i, i + 4);
            try {
                int year = Integer.parseInt(s);
                if (year >= 1000 && year <= 3999) {
                    System.out.print(year + " ");
                }
            } catch (NumberFormatException ignored) {
            }


        }
    }
}
