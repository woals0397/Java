package ch04;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ClassClass {
    public static void main(String[] args) {
        Object obj = new Object();
        Class<?> cl = obj.getClass();
        System.out.println("This object is an instance of " + cl.getName());

        // Class내 선언된 메소드 출력
        Class<?> cls = java.util.Scanner.class;
        while (cls != null){
            for(Method m : cls.getDeclaredMethods()){
                System.out.println(Modifier.toString(m.getModifiers()) + " " +
                                    m.getReturnType().getCanonicalName() + " " +
                                    m.getName() +
                        Arrays.toString(m.getParameters()));
            }
            cls = cls.getSuperclass();
        }
    }
}
