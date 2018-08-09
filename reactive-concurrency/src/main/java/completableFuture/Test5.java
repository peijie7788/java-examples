package completableFuture;

import java.util.concurrent.CompletableFuture;

public class Test5 {
    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = new CompletableFuture<>();

        completableFuture.whenComplete((v,t) -> System.out.println("Complete! " + v)).whenComplete((v, t) -> System.out.println("Complete!111 " + v));

        completableFuture.thenAccept((v) -> System.out.println("After Complete!" + v));

        completableFuture.complete(3);


    }
}
