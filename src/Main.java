import javax.sound.midi.Soundbank;

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

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            arrayStack.push(i);
            System.out.println(arrayStack);
        }

        arrayStack.pop();
        System.out.println(arrayStack);


    }


}
