package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        CompletableFuture<String> resultat = CompletableFuture.supplyAsync(()->{
            System.out.println("Being executed");
            return  "adsf";
        }).thenApply(result -> {
            System.out.println(result.length());
            return result;
        });

        CompletableFuture<Double> future = CompletableFuture.supplyAsync(() -> {
            return Math.PI;
        });

        CompletableFuture<Double> futur = future.thenCompose(result -> {
            System.out.println(result);
            return CompletableFuture.supplyAsync(() -> result * Math.PI);
        });

        System.out.println(futur.get());



//        CompletableFuture<Double> future1 = future.thenCompose(result -> result*3);
//
//        CompletableFuture<String> resultat = CompletableFuture.supplyAsync(()->{
//            System.out.println("Being executed");
//            return  "adsf";
//        }).
    }
}
