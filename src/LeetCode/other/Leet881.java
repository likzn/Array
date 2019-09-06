package LeetCode.other;

import Array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/28 10:39
 * @description:
 */
public class Leet881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int num = 0;
        int start = 0;
        int finsh = people.length - 1;
        while (start <= finsh) {
            if (people[start] + people[finsh] <= limit) {
                finsh = finsh - 1;
                start = start + 1;
                num++;
            } else {
                finsh = finsh - 1;
                num++;
            }
        }
        return num;
    }

}
