package LeetCode.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/28 10:39
 * @description:
 */
public class Leet984 {
    public String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder();
        char a = 'a';
        char b = 'b';
        if (A < B) {
            int c = A;
            A = B;
            B = c;
            char d = 'a';
            a = b;
            b = d;
        }
        while (A > 0 || B > 0) {
            if (A > 0) {
                sb.append(a);
                A--;
            }
            if (A > B) {
                sb.append(a);
                A--;
            }
            if (B > 0) {
                sb.append(b);
                B--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Leet984().strWithout3a3b(1, 2));
    }

}
