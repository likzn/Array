package LeetCode.剑指offer;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer13 {
    public void reOrderArray(int [] array) {
        int[] res = new int[array.length];
        int head = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if ((num & 1) == 1) {
                res[head++] = num;
            }
        }
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if ((num & 1) == 0) {
                res[head++] = num;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = res[i];
        }
    }
}
