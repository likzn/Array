package 笔试;

import com.sun.media.sound.RIFFInvalidDataException;

/**
 * @author: Li jx
 * @date: 2020/9/11 15:07
 * @description:
 */
public class 有赞9_11 {
    public static long sum(int num, int itemNum) {
        long res = 0;
        int a = num;
        for (int i = 0; i < itemNum; i++) {
            res += num;
            num = num * 10 + a;
        }
        return res;
    }

    public static void main(String[] args) {
        int res = minMoves(new int[]{1, 2, 4});
        System.out.println(res);
    }

    public static int minMoves (int[] nums) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            left = Math.min(left, nums[i]);
            right = Math.max(right, nums[i]);
        }
        int res = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            res += Math.abs(right - nums[i]);
//        }
        for (int i = left; i < right; i++) {
            int moveTimes = 0;
            for (int j = 0; j < nums.length; j++) {
                moveTimes += Math.abs(i - nums[j]);
            }
            res = Math.min(res, moveTimes);
        }
//        while (left <= right) {
//            int moveTimes = 0;
//            int mid = (left + right) / 2;
//            for (int i = 0; i < nums.length; i++) {
//                moveTimes += Math.abs(mid - nums[i]);
//            }
//            if (moveTimes < res) {
//                right = mid;
//                res = moveTimes;
//            } else if (moveTimes > res) {
//                left = mid;
//            } else {
//                break;
//            }
//        }
        return res;
    }
}
