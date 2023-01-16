package threads;

import static java.lang.Thread.sleep;

public class MyTask implements Runnable {
    private final String name;

    public MyTask(String name) {
        this.name = name;
    }

    public void run() {
        // Perform the task
        System.out.println("Starting " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed " + name);
    }
}
