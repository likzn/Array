package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/8/28 15:56
 * @description:
 */
public class Leet693 {
    public boolean hasAlternatingBits(int n) {
        int temp = (n ^ (n >> 1));

        return (temp & temp+1)==0;
    }
}
