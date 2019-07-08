package LeetCode.other;

/**
 * @auther: Li jx
 * @date: 2019/4/16 15:48
 * @description:
 */
public class LeetCode_69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double a = x;
        while (Math.abs(a - (a + x / a) / 2) > Math.pow(10, -6)) {

            a = (a + x / a) / 2;
        }
        return (int) a;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode_69().mySqrt(7));
    }


}
