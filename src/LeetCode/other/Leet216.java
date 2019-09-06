package LeetCode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/4 17:54
 * @description:
 */
public class Leet216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        List list = new ArrayList();
        find(ints, new ArrayList(), 0, 0, k, n,list);
        return list;
    }

    public void find(int[] ints,List curList,int index,int curSum,int k,int n,List finalList) {
        if (curList.size() == k && curSum == n) {
            finalList.add(curList);
        }
        if (curList.size() == k + 1) {
            return;
        }
        for (int i = index; i < ints.length; i++) {
            if (curSum + ints[index] > n ) {
                return;
            } else {
                List list1 = new ArrayList(curList);
                list1.add(ints[i]);
                find(ints, list1, i + 1, curSum + ints[i], k, n, finalList);
            }
        }
    }

    public static void main(String[] args) {
        new Leet216().combinationSum3(3, 7);
    }
}
