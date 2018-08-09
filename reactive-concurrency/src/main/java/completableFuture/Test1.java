package completableFuture;

import java.util.concurrent.CompletableFuture;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {


        CompletableFuture.supplyAsync(() -> {
            System.out.println("supply Running");
            String name = Thread.currentThread().getName();
            System.out.println("Async Task in " + name);



            return "hi";
            // Run some computation
        }).thenRun(() -> {


            System.out.println("Hi");
            String name = Thread.currentThread().getName();
            System.out.println("Call back Run in " + name);
            // Computation Finished.
        });

        while(true){
            Thread.sleep(1000);
            String name = Thread.currentThread().getName();
            System.out.println("Run in " + name);
        }

//        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
//            System.out.println("supply Running1");
//            String name = Thread.currentThread().getName();
//            System.out.println("Async Task in " + name);
//            return 1;
//        });
//
//        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> {
//            System.out.println("supply Running2");
//           return 3;
//        });


    }
}
