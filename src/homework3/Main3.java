package homework3;

import java.util.*;

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
        List<Integer> integerList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        System.out.println();
        listClass.startJengo(integerList);

        System.out.println();
        CreditCard creditCard1 = new CreditCard("Petrov","123456789012");
        CreditCard creditCard2 = new CreditCard("Ivanov","767676787559");
        CreditCard creditCard3 = new CreditCard("Petrov","123456789012");
        SetClass setClass = new SetClass();
        setClass.putCreditCard(creditCard1);
        setClass.putCreditCard(creditCard2);
        setClass.putCreditCard(creditCard3);

        System.out.println();
        Map <String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("Flower", "Marry");
        stringStringMap.put("V1","Vasya" );
        stringStringMap.put("O2","Oleg");
        MapClass mapClass = new MapClass(stringStringMap);
        mapClass.registration("Cat","Kate");
        mapClass.registration("V1", "Ivan");
        mapClass.remove("Flower");
        mapClass.remove("aa");



    }
}
