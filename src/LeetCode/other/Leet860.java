package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/9/5 10:22
 * @description:
 */
public class Leet860 {
    public boolean lemonadeChange(int[] bills) {
        int fiveNum = 0;
        int tenNum = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveNum++;
            }
            if (bills[i] == 10) {
                fiveNum--;
                tenNum++;
            }
            if (bills[i] == 20) {
                if (tenNum > 0) {
                    tenNum--;
                    fiveNum--;
                } else {
                    fiveNum--;
                    fiveNum--;
                    fiveNum--;
                }
            }
            if (fiveNum < 0) {
                return false;
            }
        }
        return true;
    }
}
