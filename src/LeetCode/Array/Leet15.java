package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */
public class Leet15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            int a = i + 1;
            int b = len - 1;
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            while (a < b) {
                if (nums[a] + nums[b] + nums[i] == 0) {
                    List list = new ArrayList();
                    list.add(nums[a]);
                    list.add(nums[b]);
                    list.add(nums[i]);
                    lists.add(list);
                    b--;
                    a++;
                    while (nums[b] == nums[b - 1]) {
                        b--;
                    }
                    while (nums[a] == nums[a + 1]) {
                        a++;
                    }
                } else if (nums[a] + nums[b] > nums[i]) {
                    b--;
                    while (nums[b] == nums[b - 1]) {
                        b--;
                    }
                } else if (nums[a] + nums[b] < nums[i]) {
                    a++;
                    while (nums[a] == nums[a+1]) {
                        a++;

                    }
                }
            }
        }
        return lists;
    }

}