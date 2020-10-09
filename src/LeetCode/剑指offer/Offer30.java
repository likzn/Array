package LeetCode.剑指offer;


import java.util.ArrayList;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer30 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int size = 0;
        int lastNum = Integer.MIN_VALUE;
        if (array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (lastNum != array[i]) {
                if (size > 0) {
                    size--;
                } else {
                    lastNum = array[i];
                    size = 1;
                }
            } else {
                size++;
            }
        }
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == lastNum) {
                num++;
            }
        }
        return num > array.length / 2 ? lastNum : 0;
    }
    
}
