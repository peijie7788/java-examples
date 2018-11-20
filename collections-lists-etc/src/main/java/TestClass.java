import model.Kid;
import model.OtxKid;
import model.PoorKid;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestClass {

    private static void print(String message){
        System.out.println(Thread.currentThread().getName() + ": " + message);
    }


    public static void main(String[] args) throws InterruptedException {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.forEach(System.out::println);
        numbers.forEach(new Consumer<Number>() {
            @Override
            public void accept(Number number) {
                System.out.println(number);
            }
        });

        int a, b, c;

        a = b = 3;

        numbers.forEach(TestClass::must);

        ClassThatInvolvesSupplier<Number> classThatInvolvesSupplier = new ClassThatInvolvesSupplier<>();
        classThatInvolvesSupplier.doSth(new Supplier<Number>() {
            @Override
            public Number get() {

                return null;
            }
        });

        classThatInvolvesSupplier.doSth(new Supplier<Integer>(){

            @Override
            public Integer get() {
                return null;
            }
        });



        List<? extends Number> numberList = new ArrayList<>();
        numberList.get(0).intValue();

        List<? super Integer> integerList = new ArrayList<>();
        integerList.add(new Integer(3));
    }

    static void must(Object o){

    }

//    static <T> void getFrom(Supplier<? extends T> lisSupplier){
//        lisSupplier.get()
//    }




    //List<List<Integer>> is a subtype of List<List>
    static <E> void tellType(Class<? extends E> listClass, List<E> list){
//        list.getClass();
        System.out.println(list.getClass());

    }
}
