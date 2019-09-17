package LeetCode.Array;

/**
 * @author: Li jx
 * @date: 2019/9/14 10:50
 * @description:
 */
public class Leet1089 {
    public void duplicateZeros(int[] arr) {
        int zeroNum = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + zeroNum == arr.length - 1) {
                index = i;
                break;
            }
            if (arr[i] == 0) {
                zeroNum++;
            }
            if (i + zeroNum == arr.length - 1) {
                index = i;
                break;
            }
        }
        int length = arr.length - 1;
        if ((zeroNum & 1)== 1) {
            arr[length--] = arr[index--];

        }
        while (index != -1) {
            if (arr[index] == 0) {
                arr[length--] = arr[index];
                arr[length--] = arr[index];
            } else {
                arr[length--] = arr[index];
            }
            index--;
        }
    }

    public static void main(String[] args) {
        new Leet1089().duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }
}

