package LeetCode.other;

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
        int size = 0;
        int a = 0;
        int b = people.length - 1;
        while (a <= b) {
            if (people[a] + people[b] > limit) {
                b--;
            } else {
                a++;
                b--;
            }
            size++;
        }
        return size;
    }

}
