package 蓝桥杯;

/**
 * @author: Li jx
 * @date: 2019/11/21 14:55
 * @description:
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] s1 = s.split(" ");
        in.close();
        int num = 0;
        int index = 0;
        ArrayList res = new ArrayList();
        while (true) {
            for (int i = index; i < Math.pow(2, num) + index && i < s1.length; i++) {
                char c = s1[i].charAt(0);
                if (c != '#') {
                    res.add(c);
                    break;
                }
            }
            index += Math.pow(2, num);
            if (index >= s1.length) {
                break;
            }
            num++;
        }
        System.out.print("[");
        for (int i = 0; i < res.size(); i++) {
            if (i == res.size() - 1) {
                System.out.print(res.get(i));
                break;
            }
            System.out.print(res.get(i)+" ");
        }
        System.out.println("]");
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            Main n = new Main();
//            System.out.println(n.totalNQueens(sc.nextInt()));
//        }
//
//    }
//    int[] x;
//    int N;
//    int sum = 0;
//    public int totalNQueens(int n) {
//        N = n;
//        x = new int[N+1];
//        backTrace(1);
//        return sum;
//    }
//
//    private boolean place(int col){
//        for(int i = 1; i < col; i++){
//            if(Math.abs(col - i)==Math.abs(x[col]-x[i])||x[col]==x[i]){
//                return false;
//            }
//        }
//        return true;
//    }
//    private void backTrace(int t) {
//        if(t>N){
//            sum++;
//        }else {
//            //第t行。遍历全部的节点
//            for(int j = 1; j <= N; j++) {
//                x[t] = j ;
//                //假设第j个节点能够放下皇后
//                if(place(t)){
//                    //接着放下一个
//                    backTrace(t+1);
//                }
//            }
//        }
//
//    }

}
