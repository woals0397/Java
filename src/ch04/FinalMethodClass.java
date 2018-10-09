package ch04;

class Em{
    private String name = "JM";

    public final String getName(){
        return name;
    }
}

final class Pm{
    public void statePrint(){
        System.out.println("Class Pm");
    }
}

class Gm extends Em{
    // final로 선언된 메서드는 Overriding을 할 수 없다.
    /*
    @Override
    public String getName(){
        return super.getName();
    }
    */
}

// final로 선언된 클래스는 상속을 할 수 없다.
/*
class Am extends  Pm{
}
*/

public class FinalMethodClass {
    public static void main(String[] args) {

    }
}
