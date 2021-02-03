package homework3;

import java.util.LinkedList;
import java.util.List;

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
}
