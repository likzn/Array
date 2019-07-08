package LeetCode.LinkedList;

import com.sun.xml.internal.ws.api.pipe.NextAction;
import org.w3c.dom.NodeList;

import javax.swing.*;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @auther: Li jx
 * @date: 2019/4/11 20:54
 * @description:
 */
public class link23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {

            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val) {
                    return -1;
                } else if (o1.val == o2.val) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        for (ListNode l : lists) {
            if (l != null) {

            priorityQueue.add(l);
            }
        }
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        while (!priorityQueue.isEmpty()) {
            ListNode node = priorityQueue.poll();
            p.next = node;
            p = p.next;
            if (node.next != null) {
                priorityQueue.add(node.next);
            }
        }
        return dummyHead.next;

    }
}
