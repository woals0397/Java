package ch05;

import java.io.IOException;

public class FileFormatException extends IOException {
    // 예외 클래스를 직접 만들 때는 인자 없는 생성자와 메시지 문자열을 받는 생성자를 구현하는 것이 좋다.
    public FileFormatException(){}
    public FileFormatException(String message){
        super(message);
    }
}

class ExceptionA {
    String directions;
    public void process(String directions){
        //this.directions = Object.requireNonNull(directions);
    }
}

class Submain{
    public static void main(String[] args) {
        ExceptionA a = new ExceptionA();
        a.process(null);
    }
}