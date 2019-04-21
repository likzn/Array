package LeetCode.other;

/**
 * @auther: Li jx
 * @date: 2019/4/16 15:48
 * @description:
 */
public class LeetCode_167 {

    public int[] twoSum(int[] numbers, int target) {
        int a = 0 ;
        int b = numbers.length-1;
        while (true) {
            if (numbers[a] + numbers[b] > target) {
                b--;
            } else if (numbers[a] + numbers[b] < target) {
                a++;
            } else {
                break;
            }

        }
        return new int[]{++a, ++b};
    }




}
