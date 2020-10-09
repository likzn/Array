package LeetCode.second;

/**
 * @author: Li jx
 * @date: 2019/10/31 14:34
 * @description:
 */
public class Leet27 {
    public int removeElement(int[] nums, int val) {
        int countVal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                countVal++;
                continue;
            }
            nums[i - countVal] = nums[i];
        }
        return nums.length - countVal;
    }

    public static void main(String[] args) {
        new Leet27().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }
}
