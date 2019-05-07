package SegmentTree;

/**
 * @auther: Li jx
 * @date: 2019/4/24 16:37
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1, 3, 56, -1, 4, 65, 7};
        SegmentTree<Integer> tree = new SegmentTree<Integer>(ints, (a,b)->a+b);

        System.out.println(tree.query(3, 4));

    }
}
