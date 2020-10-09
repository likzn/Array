package 笔试;

import Array.Array;

import java.util.*;

/**
 * @author: Li jx
 * @date: 2020/9/13 15:15
 * @description:
 */
public class 爱奇艺9_13 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int max = 0;
//        for (int i = 0; i < str.length(); i++) {
//            int length = 0;
//            HashSet<Character> set = new HashSet<>();
//            for (int j = i; j < str.length(); j++) {
//                char c = str.charAt(j);
//                if (set.contains(c)) {
//                    max = Math.max(max, length);
//                    break;
//                }else {
//                    set.add(c);
//                    length++;
//                }
//            }
//        }
//        System.out.println(max);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            if (a > 0) {
                break;
            }
            if (i != 0 && a == list.get(i - 1)) {
                continue;
            }
            int left = i + 1;
            int right = list.size() - 1;
            while (left < right) {
                if (list.get(left) + list.get(right) + a == 0) {
                    System.out.println(a + " " + list.get(left) + " " + list.get(right));
                    left++;
                }else if(list.get(left) + list.get(right) + a > 0){
                    right--;
                }else {
                    left++;
                }
            }
        }


//        HashSet<List<Integer>> res = new HashSet<>();
//        Collections.sort(list);
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                for (int k = j + 1; k < list.size(); k++) {
//                    int a = list.get(i);
//                    if (a > 0) {
//                        break;
//                    }
//                    int b = list.get(j);
//                    int c = list.get(k);
//                    if (a + b + c == 0) {
//                        List<Integer> list1 = new ArrayList<>();
//                        list1.add(a);
//                        list1.add(b);
//                        list1.add(c);
//                        Collections.sort(list1);
//                        res.add(list1);
//                    }
//                }
//            }
//        }
//        res.forEach(e -> {
//            for (int i = 0; i < e.size(); i++) {
//                if (i != e.size() - 1) {
//                    System.out.print(e.get(i) + " ");
//                }else {
//                    System.out.println(e.get(i));
//                }
//            }
//
//
//        });
    }
}
