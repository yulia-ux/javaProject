package homework3;

import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListClass {
    public void start(int...x){
        List<Integer> list = new LinkedList<>();
        for(int i=0; i<x.length; i++){
            if(i%2==0){
                list.add (0, x[i]);
            } else {
                list.add (list.size(),x[i]);
            }
        }
        System.out.println(list);
        for (int i=list.size(); i>0; i--){
            System.out.print(list.get(i-1));
        }
    }
    public void startJengo(List<Integer>jengo){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
           OptionalInt optionalInt = random.ints(1,1, jengo.size()-2).findFirst();
           int randomIndex = optionalInt.getAsInt();
           Integer x = jengo.get(randomIndex);
           jengo.remove(randomIndex);
           jengo.add(x);
        }
        System.out.println(jengo);
    }

}
