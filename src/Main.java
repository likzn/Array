import javax.sound.midi.Soundbank;
import java.util.ArrayDeque;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Array<Integer> array = new Array();
//        for (int i = 0; i < 10; i++) {
//            array.addLast(i);
//        }
//        System.out.println(array);
//        array.addFirst(124124);
//        System.out.println(array);
//
//        array.remove(2);
//        System.out.println(array);
//
//        array.removeFirst();
//        System.out.println(array);
//
//        array.removeLast();
//        System.out.println(array);
//
//        array.removeElement(1);
//        System.out.println(array);

//        ArrayStack<Integer> arrayStack = new ArrayStack<>();
//        for (int i = 0; i < 5; i++) {
//            arrayStack.push(i);
//            System.out.println(arrayStack);
//        }
//
//        arrayStack.pop();
//        System.out.println(arrayStack);

//        ArrayQueue<Integer> arrayQueue = new ArrayQueue();
//        for (int i = 0; i < 10; i++) {
//            arrayQueue.enqueue(i);
//        }
//        System.out.println(arrayQueue);
//
//        arrayQueue.dequeue();
//        arrayQueue.dequeue();
//        System.out.println(arrayQueue);
//        LoopQueue<Integer> loopQueue = new LoopQueue();
//        for (int i = 0; i < 10; i++) {
//            loopQueue.enqueue(i);
//            System.out.println(loopQueue);
//            if (i % 3 == 2) {
//                loopQueue.dequeue();
//                System.out.println(loopQueue);
//
//            }
//        }
        int i = 300000;
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        System.out.println(testQueue(loopQueue, i));
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        System.out.println(testQueue(arrayQueue, i));
    }

    public static double testQueue(Queue<Integer> queue, int opCounts) {
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < opCounts; i++) {
            queue.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCounts; i++) {
            queue.dequeue();
        }


        long endTime = System.nanoTime();

        return (endTime - startTime)/1000000000.0;
    }

}
