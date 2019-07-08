package Array;

/**
 * @auther: Li jx
 * @date: 2019/4/15 13:28
 * @description:
 */
public class Sum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sum(arr));

    }

    public static int sum(int arr[]) {
        return sum(arr, 0, arr.length);
    }

    public static int sum(int[] arr, int l) {
        if (arr.length == l) {
            return 0;
        }
        return arr[l] + sum(arr, l + 1);
    }

    public static int sum(int[] arr, int l, int r) {
        if (l + 1 == r) {
            return arr[l];
        }
        return sum(arr, l, (l + r) / 2) + sum(arr, (l + r) / 2, r);
    }


}
