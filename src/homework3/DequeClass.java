package homework3;

import java.util.*;

public class DequeClass  {
    private List <Integer> listPatients;

    public DequeClass(List<Integer> listPatients) {
        this.listPatients = listPatients;
    }
    public void start(){
        int counter = 0;
        int endCounter = 1;
        for(int i=0; i<listPatients.size(); i++){
            if (i >= listPatients.size() - endCounter) {
                break;
            }
            if (counter == 2){
                System.out.print(listPatients.size()- endCounter);
                counter = 0;
                endCounter ++;
            }
            System.out.print(listPatients.get(i));
            counter++;

        }
    }
    public void start2(){
        Deque<Integer> integerDeque = new ArrayDeque<>(listPatients);
        int counter = 0;
        while (integerDeque.size() != 0){
            if (counter == 2){
                System.out.print(integerDeque.pollLast());
                counter = 0;
            } else {
                System.out.print(integerDeque.pollFirst());
                counter++;
            }
        }
    }
    public void randomStart(){
        Deque<Integer> integerDeque = new ArrayDeque<>();
        Random random = new Random();
        for(int i=0; i<10; i++){
            int a = random.nextInt();
            integerDeque.add(a);
        }
        while(integerDeque.size()!=1){
            System.out.println(integerDeque.pollLast());
        }

    }
}
