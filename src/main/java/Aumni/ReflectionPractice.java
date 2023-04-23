package Aumni;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionPractice {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("Aumni.A");
        Object o= c.newInstance();
        Method m =c.getDeclaredMethod("message", null);
        m.setAccessible(true);
        m.invoke(o, null);


    }

}


