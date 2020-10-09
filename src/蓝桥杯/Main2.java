package 蓝桥杯;

import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2019/11/21 12:57
 * @description:
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res += (char)((c - 'a' + 3) % 26 + 'a');
        }
        System.out.println(res);

    }
}
