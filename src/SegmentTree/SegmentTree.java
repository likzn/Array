package SegmentTree;

/**
 * @auther: Li jx
 * @date: 2019/4/24 13:04
 * @description:
 */
public class SegmentTree<E> {
    private E[] data;
    private E[] tree;
    private Merger<E> merger;

    public SegmentTree(E[] arr, Merger<E> merger) {
        this.merger = merger;
        data = (E[]) new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }
        tree = (E[]) new Object[4 * arr.length];
        buildSegmentTree(0, 0, data.length - 1);
    }

    private void buildSegmentTree(int index, int left, int right) {
        if (left == right) {
            tree[index] = data[left];
            return;
        }
        int leftChild = leftChild(index);
        int rightChild = rightChild(index);
        int mid = left + (right - left) / 2;
        buildSegmentTree(leftChild, left, mid);
        buildSegmentTree(rightChild, mid + 1, right);

        tree[index] = merger.merge(tree[leftChild], tree[rightChild]);
    }

    public E query(int l, int f) {
        if (l < 0 || l > data.length || f < 0 || f > data.length || l > f) {
            throw new IllegalArgumentException("l or f is illegal");
        }
        return query(0, 0, data.length - 1, l, f);
    }

    private E query(int treeIndex, int indexLeft, int indexRight, int l, int r) {
        if (l == indexLeft && r == indexRight) {
            return tree[treeIndex];
        }
        int mid = indexLeft + (indexRight - indexLeft) / 2;
        int leftChild = leftChild(treeIndex);
        int rightChild = rightChild(treeIndex);
        if (mid + 1 <= l) {
            return query(rightChild, mid + 1, indexRight, l, r);
        } else if (mid >= r) {
            return query(leftChild, indexLeft, mid, l, r);
        } else {
            E left = query(leftChild, indexLeft, mid, l, mid);
            E right = query(rightChild, mid + 1, indexRight, mid + 1, r);
            return merger.merge(left, right);
        }

    }

    public void set(int index, E e) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("index is illegal");
        }
        data[index] = e;
        set(0, 0, data.length - 1, index, e);
    }

    private void set(int treeIndex, int left, int right, int index, E e) {
        if (left == right) {
            tree[treeIndex] = e;
            return;
        }
        int mid = left + (right - left) / 2;
        int leftChild = leftChild(treeIndex);
        int rightChild = rightChild(treeIndex);

        if (index >= mid + 1) {
            set(rightChild, mid + 1, right, index, e);
        } else {
            set(leftChild, left, mid, index, e);
        }

        tree[treeIndex] = merger.merge(tree[leftChild], tree[rightChild]);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    public int getSize() {
        return data.length;
    }

    public E get(int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("index is illegal");
        }
        return data[index];
    }
}
