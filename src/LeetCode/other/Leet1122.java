package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/10/1 14:20
 * @description:
 */
public class Leet1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] bucket = new int[1001];
        int[] answer = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            bucket[arr1[i]]++;
        }

        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (bucket[arr2[i]]-- > 0) {
                answer[index++] = arr2[i];
            }
        }
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i]-- > 0) {
                answer[index++] = i;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        new Leet1122().relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                new int[]{2,1,4,3,9,6});
    }
}
