package LeetCode.剑指offer;


import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class 滑动窗口 {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> list = new ArrayList();
        LinkedList<Integer> index = new LinkedList<>();
        for(int i=0;i<size;i++){
            while(!index.isEmpty()&&index.peek()>=num[i]){
                index.pop();
            }
            index.push(i);
        }
        for(int i = size;i<num.length;i++){
            list.add(num[index.getFirst()]);
            while(!index.isEmpty()&&index.peek()>=num[i]){
                index.pop();
            }
            if(!index.isEmpty()&&index.peekFirst()<=i-size){
                index.pollFirst();
            }
            index.push(i);

        }
        return list;

    }
    
}
