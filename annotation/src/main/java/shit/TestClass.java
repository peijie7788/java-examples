package shit;


import annotations.Crap;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestClass {
//    @SuppressWarnings("unused")
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Person p = Person.class.newInstance();

        Method method = Person.class.getDeclaredMethod("eat");


        Method method1= Person.class.getDeclaredMethod("setAge", int.class);

        method1.invoke(p, 10);

        Crap annotation = method.getAnnotation(Crap.class);

        System.out.println(annotation);



//        method.invoke(method);


    }
}
