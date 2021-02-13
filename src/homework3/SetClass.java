package homework3;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
    private Set <CreditCard> creditCardSet = new HashSet<>();
    public void putCreditCard (CreditCard creditCard){
        creditCardSet.add(creditCard);
        System.out.println(creditCardSet);

    }
}
