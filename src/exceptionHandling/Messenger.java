package exceptionHandling;

import java.io.IOException;
import java.util.InputMismatchException;

public class Messenger {
    public Beans buyBeans(int amount, boolean withOmiEwa, boolean isFake) throws IOException {
        try {
            return sendSomebodyElse(amount, withOmiEwa, isFake);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
}



    private Beans sendSomebodyElse(int amount, boolean withOmiEwa, boolean isFake) throws IOException{
        if(amount < 50) throw new InputMismatchException("You no get money");
        if(isFake) throw new InputMismatchException("Your money be fake oh");
        return new Beans(amount, withOmiEwa);
    }
}
