import java.util.function.Supplier;

public class ClassThatInvolvesSupplier<T> {
    public T doSth(Supplier<? extends T> supplier){
        return supplier.get();
    }
}
