package Heap;

import Array.Array;
import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Date;

/**
 * @auther: Li jx
 * @date: 2019/4/22 20:04
 * @description:
 */
public class MaxHeap<E extends Comparable<E>> {
    private Array<E> array;

    public MaxHeap(int capacity) {
        array = new Array<E>(capacity);
    }

    public MaxHeap() {
        array = new Array<E>();
    }


    public MaxHeap(E[] e) {
        array = new Array<E>(e);
        for (int i = parent(e.length - 1); i >= 0; i--) {
            siftDown(i);
        }
    }

    public int size() {
        return array.getSize();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    private int parent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("index-0 doesnt have parent");
        }
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    public void add(E e) {
        array.addLast(e);
        siftUp(array.getSize() - 1);
    }

    private void siftUp(int index) {
        while (index > 0 && array.get(parent(index)).compareTo(array.get(index)) < 0) {
            array.swap(index, parent(index));
            index = parent(index);
        }
    }

    public E findMax() {
        if (isEmpty()) {
            throw new IllegalArgumentException("its empty");
        }
        return array.get(0);
    }

    public E extractMax() {
        E max = findMax();
        array.swap(0, array.getSize() - 1);
        array.removeLast();
        siftDown(0);


        return max;
    }

    private void siftDown(int i) {
        while (leftChild(i) < array.getSize()) {
            int j = leftChild(i);
            if (j + 1 < array.getSize() && array.get(j).compareTo(array.get(j + 1)) < 0) {
                j = j + 1;
            }
            if (array.get(i).compareTo(array.get(j)) > 0) {
                break;
            }
            array.swap(i, j);
            i = j;
        }

    }

    public E replace(E e) {
        E q = findMax();
        array.set(0, e);
        siftDown(0);
        return q;

    }

}
