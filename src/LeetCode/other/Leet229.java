package LeetCode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/3 18:38
 * @description:
 */
public class Leet229 {
    public List<Integer> majorityElement(int[] nums) {
        List list = new ArrayList();
        int x = 0, y = 0, cx = 0, cy = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((cx == 0 || x == nums[i]) && nums[i] != y) {
                cx++;
                x = nums[i];
            }else if (cy == 0 || y == nums[i]) {
                cy++;
                y = nums[i];
            } else {
                cx--;
                cy--;
            }
        }
        cx = 0;
        cy = 0;
        for (Integer i : nums) {
            if (i == x) {
                cx++;
            }
            if (i == y) {
                cy++;
            }
        }
        if (cx > nums.length / 3) {
            list.add(x);
        }
        if (cy > nums.length / 3&&x!=y) {
            list.add(y);
        }
        return list;
    }
}
