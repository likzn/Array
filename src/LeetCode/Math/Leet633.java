package LeetCode.Math;

import javax.sound.midi.MidiChannel;

/**
 * @auther: Li jx
 * @date: 2019/4/27 16:16
 * @description:
 */
public class Leet633 {
    public boolean judgeSquareSum(int c) {
        int a = (int) Math.sqrt(c);
        int d = 0;
        int f = a;
        for (int i = 1; i <= a; i++) {
            while (d <= f) {
                int mid = d + (f - d) / 2;
                if (mid * mid + i * i < c) {
                    d = mid + 1;
                } else if (mid * mid + i * i > c) {
                    f = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
