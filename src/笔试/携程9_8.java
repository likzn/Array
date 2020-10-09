package 笔试;

import java.util.*;

/**
 * @author: Li jx
 * @date: 2020/9/8 19:09
 * @description:
 */
public class 携程9_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ban = sc.nextLine();
        String str = sc.nextLine();
        String replaced = sc.next();
        if (ban.length() > str.length()) {
            System.out.println(str);

        }
        int[] ints = new int[700];

        for (int j = 0; j < ban.length(); j++) {
            ints[ban.charAt(j)]++;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + ban.length() - 1 > str.length()) {
                res.append(str.substring(i));
                break;
            }
            int[] copy = Arrays.copyOf(ints, 700);
            for (int j = i; j < i + ban.length(); j++) {
                copy[str.charAt(j)]--;
            }
            if (isReplaced(copy)) {

                res.append(replaced);
                i = i + ban.length() - 1;
            } else {
                res.append(str.charAt(i));
            }
        }

        System.out.println(res.toString());

    }

    private static boolean isReplaced(int[] copy) {
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] != 0) {
                return false;

            }
        }
        return true;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] strings = str.split(" ");
//        LinkedList<String> linkedList = new LinkedList<>();
//        for (int i = 0; i < strings.length; i++) {
//            String next = strings[i];
//            int size = linkedList.size();
//            if (size == 0) {
//                for (int j = 0; j < next.length(); j++) {
//                    linkedList.addLast(String.valueOf(next.charAt(j)));
//                }
//                continue;
//            }
//            for (int k = 0; k < size; k++) {
//                String pop = linkedList.pollFirst();
//                for (int j = 0; j < next.length(); j++) {
//                    linkedList.addLast(pop + next.charAt(j));
//                }
//            }
//
//        }
//        for (int i = 0; i < linkedList.size(); i++) {
//            String s = linkedList.get(i);
//            int[] ints = new int[200];
//            boolean flag = false;
//            for (int j = 0; j < s.length(); j++) {
//                if (ints[Character.toLowerCase(s.charAt(j))] != 0) {
//
//                    flag = true;
//                    break;
//                }
//                ints[Character.toLowerCase(s.charAt(j))]++;
//            }
//
//            if (flag) {
//                System.out.println(s + "--circular dependency");
//            } else {
//                System.out.println(s);
//            }
//
//        }
//
//    }
}
