package homework1;

public class Main {
    public static void main(String[] args) {
        Animal hare = new Animal();
        hare.name = "Peter";
        hare.speed = 15.5;
        hare.isMammal = true;
        hare.printInfo();


        int[] myArray = new int[4];
        myArray [0]=15;
        myArray [1]=4;
        //myArray [2]=-14;
        myArray [3]=40;

        for (int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }

        String [] x = new String[10];
        x [2] = "200";
        x [5] = "apple";
        x [9] = "sun";
        for (int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
        System.out.println("_______");

        for (int i=x.length-1; i>=0; i--){
            System.out.println(x[i]);
        }


    }
}
