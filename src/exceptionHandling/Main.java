package exceptionHandling;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Messenger yahooMessenger = new Messenger();
      try {
          Beans beans = yahooMessenger.buyBeans(50, true, false);
          System.out.println(beans);
      }
        catch(IOException e){
            Beans agoyin = yahooMessenger.buyBeans(49, false, true);
            System.out.println(agoyin);
        }

    }
}
