package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/9/18 19:11
 * @description:
 */
public class Leet1041 {
    public boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        //上下左右 1234
        int dir = 1;
        for (int i = 0; i < instructions.length(); i++) {
            char c = instructions.charAt(i);
            if (c == 'L') {
                if (dir == 1) {
                    dir = 3;
                } else if (dir == 3) {
                    dir = 2;
                } else if (dir == 2) {
                    dir = 4;
                }else if (dir == 4) {
                    dir = 1;

                }
            }
            if (c == 'R') {
                if (dir == 1) {
                    dir = 4;
                } else if (dir == 3) {
                    dir = 1;
                } else if (dir == 2) {
                    dir = 3;
                }else if (dir == 4) {
                    dir = 2;
                }
            }
            if (c == 'G') {
                if (dir == 1) {
                    y++;
                } else if (dir == 2) {
                    y--;
                } else if (dir == 3) {
                    x--;
                }else if (dir == 4) {
                    x++;
                }
            }
        }
        if (x == 0 && y == 0) {
            return true;
        }
        if (dir != 1) {
            return true;
        }
        return false;
    }
}
