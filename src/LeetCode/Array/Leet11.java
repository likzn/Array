package LeetCode.Array;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */
public class Leet11 {
    public int maxArea(int[] height) {
        int buttom = 0;
        int top = height.length - 1;
        int max = 0;
        while (buttom < top) {
            max = Math.max(max, (top - buttom) * Math.min(height[buttom], height[top]));
            if (height[buttom] < height[top]) {
                buttom++;
            } else {
                top--;
            }
        }
        return max;
    }


}