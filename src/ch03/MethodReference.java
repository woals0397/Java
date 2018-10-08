package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        String[] strings = {"Peter", " JM", "Park"};
        //Arrays.sort(strings, (x, y) -> x.compareTo(y));
        Arrays.sort(strings, String::compareTo);

        List<String> list = Arrays.asList("JaeMin", "Jaeseon");

        // 클래스::인스턴스메서드
        // 클래스::정적메서드
        // 객체::인스턴스메서드
        list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println);


        for(int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
