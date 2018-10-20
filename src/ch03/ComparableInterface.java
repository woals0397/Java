package ch03;

import javafx.event.EventHandler;

import java.util.Arrays;

interface Comparable<T>{    // T : 타입 파라미터
    int compareTo(T other);
}

class Employee implements Comparable<Employee>{
    @Override
    public int compareTo(Employee other) {
        return 0;
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        // String클래스는 Comparable인터페이스를 구현한다.
        Arrays.sort(new String[]{"Peter", "Paul", "Mary"});
    }
}
