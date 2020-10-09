package LeetCode.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/10/2 13:13
 * @description:
 */
public class Leet884 {
    public String[] uncommonFromSentences(String A, String B) {
        String[] strings = (A + " " + B).split(" ");
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], map.getOrDefault(strings[i], 0) + 1);
        }
        map.keySet().forEach(e->{

            if (map.get(e) == 1) {
                list.add(e);
            }
        });
        String[] res  = new String[list.size()];
        return list.toArray(res);
    }

}
