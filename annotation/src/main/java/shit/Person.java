package shit;

import annotations.Crap;
import sun.misc.Unsafe;

public class Person {
    private volatile int age;

    @Crap(min = 3, max = 100)
    public void eat(){
        System.out.println(age + " years old is eating");
    }

    public int ea1t(){
        Unsafe.getUnsafe();

        return 0;
    }

    public int getAge() {
        return age;
    }

    @Crap(min = 3)
    public void setAge(int age) {
        this.age = age;
    }

    public static native synchronized <T extends Person> void setname();
}
