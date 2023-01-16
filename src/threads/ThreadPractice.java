package threads;

public class ThreadPractice {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("Thread from anonymous class is executing")
        );
        thread.start();
        System.out.println("Task on main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();
    }


}
