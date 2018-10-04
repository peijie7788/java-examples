package observerble;

public class Kid implements Callback{
    @Override
    public void callBack(String result) {
        System.out.println("Kid(Observer) got the result: " + result);
    }
}
