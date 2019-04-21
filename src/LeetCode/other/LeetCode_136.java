package LeetCode.other;

/**
 * @auther: Li jx
 * @date: 2019/4/16 15:48
 * @description:
 */
public class LeetCode_136 {

    public int singleNumber(int[] nums) {

        int a = 0;
        for (int i = 1; i < nums.length; i++) {
            a = a ^ i;
        }
        return a;
    }




}
