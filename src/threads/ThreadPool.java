package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        // Create a thread pool with 2 worker threads
        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        // Submit tasks to the thread pool
        threadPool.submit(new MyTask("Task 1"));
        threadPool.submit(new MyTask("Task 2"));
        threadPool.submit(new MyTask("Task 3"));

        // Shut down the thread pool
        threadPool.shutdown();
    }
}

