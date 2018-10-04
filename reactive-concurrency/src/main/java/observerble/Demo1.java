package observerble;

import rx.Observable;

public class Demo1 {
    public static void main(String[] args) {
//        String result = xenoComputing();
//        System.out.println(result);

        Observable observable = new Observable();

    }

    public static String xenoComputing() throws InterruptedException{
        System.out.println("Doing huge amount of calculations on " + Thread.currentThread().getName());
        Thread.sleep(4000);
        System.out.println("Finally Done!");
        return "Result";
    }
}
