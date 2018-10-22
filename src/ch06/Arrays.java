package ch06;

import java.util.ArrayList;

public class Arrays {
    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception{
        for(T elem : elems)
            elem.close();
    }

    public static void printNames(ArrayList<? extends Arrays> staff){
        Arrays a = staff.get(0);
        System.out.println(a.getClass());
    }
}
