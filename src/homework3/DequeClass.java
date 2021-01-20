package homework3;

import java.util.List;

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
}
