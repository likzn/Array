package LeetCode.LeetCodeWeekend;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: Li jx
 * @date: 2019/11/10 11:03
 * @description:
 */
public class Leet5389 {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> res = new ArrayList<>();
        TreeMap<String, HashMap> table = new TreeMap<>();
        HashSet<String> set = new HashSet<>();
        ArrayList<String> resName = new ArrayList<>();
        resName.add("Table");
        for (List<String> rowTable : orders) {
            String tableNum = rowTable.get(1);
            String name = rowTable.get(2);
            if (table.get(tableNum) == null) {
                HashMap map = new HashMap();
                map.put(name, 1);
                table.put(tableNum, map);

            } else {
                HashMap<String, Integer> map = (HashMap) table.get(tableNum);
                if (map.get(name) == null) {
                    map.put(name, 1);

                } else {
                    map.put(name, map.get(name) + 1);
                }
            }
            set.add(name);

        }
        set.forEach(e -> {
            resName.add(e);
        });

        res.add(resName);
        table.keySet().forEach(key -> {
            Map value = table.get(key);
            List<String> eachTable = new ArrayList<>();
            eachTable.add(key);
            for (int i = 1; i < resName.size(); i++) {
                String name = resName.get(i);
                if (value.get(name) == null) {
                    eachTable.add(String.valueOf(0));
                } else {
                    eachTable.add(String.valueOf(value.get(name)));
                }
            }
            res.add(eachTable);
        });


        return res;

    }


}
