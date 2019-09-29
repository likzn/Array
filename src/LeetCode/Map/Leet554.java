package LeetCode.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/20 15:35
 * @description:
 */
public class Leet554 {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < wall.size(); i++) {
            List<Integer> list = wall.get(i);
            int sum = 0;
            for (int j = 0; j < list.size()-1; j++) {
                sum += list.get(j);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int sum = map.keySet().stream().map(map::get).mapToInt(e -> e).max().orElse(Integer.MIN_VALUE);
        if (sum == Integer.MIN_VALUE) {
            return wall.size();
        }
        return wall.size()-sum;
    }
}
