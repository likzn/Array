package LeetCode.second;

/**
 * @author: Li jx
 * @date: 2019/10/31 14:34
 * @description:
 */
public class Leet33 {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    public int search(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] < nums[right]) {
            if (nums[mid] < target && target <= nums[right]) {
                return search(nums, mid + 1, right, target);
            } else {
                return search(nums, left, mid - 1, target);
            }
        } else {
            if (nums[left] <= target && target < nums[mid]) {
                return search(nums, left, mid - 1, target);
            } else {
                return search(nums, mid + 1, right, target);
            }
        }
    }
}
