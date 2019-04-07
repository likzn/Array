import java.util.ArrayList;
import java.util.Stack;

/**
 * @auther: Li jx
 * @date: 2019/4/5 19:07
 * @description:
 */
public class Array<E> {
    private E[] data;
    private int size;

    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }
    public Array() {
        this(10);
    }

    /**得到数组插入的个数*/
    public int getSize() {
        return size;
    }
    //得到数组容量
    public int getCapacity() {
        return data.length;
    }
    //判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, E e) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("非法插入");
        }
        if (size == data.length) {
           resize(2 * data.length);
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }
    //从数组尾插入数据
    public void addLast(E e) {
        add(size, e);
    }
    //从数组头插入数据
    public void addFirst(E e) {
        add(0, e);
    }
    //通过指定index得到数据
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("非法index");
        }
        return data[index];
    }

    public E getLast() {
        return get(size - 1);
    }

    public E getFirst() {
        return get(0);
    }

    //通过指定index替换数据
    public void set(int index,E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("非法index");
        }
        data[index] = e;
    }
    //数组是否包括这个数字
    public boolean contains(E e) {
        return find(e) > 0 ? true : false;
    }

    //根据具体数字查找索引
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("非法index，删除失败");
        }
        E rm = data[index];
        for (int i = index; i <size-1 ; i++) {
            data[i] = data[i+1] ;
        }
        size--;
        data[size] = null;
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
        return rm;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size-1);
    }

    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array:Size:%d ,Capacity:%d\n", size, data.length));
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
     }
}
