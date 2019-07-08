package LeetCode.LinkedList;

import java.util.Arrays;

/**
 * @auther: Li jx
 * @date: 2019/7/4 16:29
 * @description:
 */
public class Leet15 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                min = Math.abs(min - target) >=Math.abs(nums[i] + nums[l] + nums[r] - target)?
                        nums[i] + nums[l] + nums[r] :min;
                if ( nums[i] + nums[l] + nums[r]  < target) {
                    l++;
                } else if ( nums[i] + nums[l] + nums[r]  == target) {
                    return target;
                } else{
                    r--;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println( new Leet15().threeSumClosest(new int[]{1, 2, 4, 8, 16, 32, 64, 128}, 82));
    }
}
