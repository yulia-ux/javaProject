package homework3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main3 {
    public static void main(String[] args) {
        DequeClass dequeClass1 = new DequeClass(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        dequeClass1.start();
        System.out.println();
        dequeClass1.start2();
        System.out.println();
        dequeClass1.randomStart();

        ListClass listClass = new ListClass();
        listClass.start(0,1,2,3,4,5,6,7,8,9);

    }
}
