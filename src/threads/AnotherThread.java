package threads;

public class AnotherThread extends Thread {
    @Override
    public void run(){
        System.out.println("Running another thread");
    }

}
