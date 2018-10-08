package ch03;

interface Closeable{
    // 인터페이스에 정의한 변수는 자동으로 public static final 이 선언된다.
    int NORTH = 10;
    int SOUTH = 20;

    void close();
}

// 인터페이스는 또 다른 인터페이스를 확장해서 원래 있던 메서드 외의 추가 메서드를 제공할 수 있다.
interface Channel extends Closeable{
    boolean isOpen();
}

interface Vol{
    void up();
}

// 클래스는 인터페이스를 몇 개 든 구현할 수 있다.
class Close implements Closeable, Vol{
    @Override
    public void close() {
    }

    @Override
    public void up() {
    }
}

public class Ex02 {
    public static void main(String[] args) {
        System.out.println(Closeable.NORTH);    // 인터페이스명으로 참조 가능
    }
}
