package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class TestClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Program start");

        CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {

                System.out.println("Running");

                // Simulate a long-running Job
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                System.out.println("I'll run in a separate thread than the main thread.");
            }
        });

        Thread.currentThread().join();
//        future.get();
    }
}
