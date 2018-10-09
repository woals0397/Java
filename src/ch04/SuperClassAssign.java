package ch04;

class A{
    public void printClass(){
        System.out.println("Class A Method");
    }
}

class B extends A{
    @Override
    public void printClass() {
        System.out.println("Class B Method");
    }
}

public class SuperClassAssign {
    public static void main(String[] args) {
        B subclassB = new B();
        A superclassA = subclassB;

        // 동적 메서드 조회 : 가상 머신에서 객체의 실제 클래스를 살펴보고 해당 클래스에 맞는 메서드를 찾아서 실행
        // 둘다 클래스B 메서드 호출
        superclassA.printClass();
        subclassB.printClass();
    }
}
