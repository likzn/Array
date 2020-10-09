package 笔试;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2020/9/13 10:08
 * @description:
 */
public class 安恒9_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            int money = sc.nextInt();
            list.add(money);
        }
        int ownMoney = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        int[] res = new int[ownMoney + 1];
        for (int i = 1; i < res.length; i++) {
            res[i] = ownMoney+1;
        }
        for (int j = 0; j < list.size(); j++) {
            int m = list.get(j);
            for (int i = m; i < ownMoney + 1; i++) {
                res[i] = Math.min(res[i - m] + 1, res[i]);
            }
        }

        if (res[ownMoney] == ownMoney+1) {
            System.out.println(-1);
        } else {
            System.out.println(res[ownMoney]);
        }

    }

}
