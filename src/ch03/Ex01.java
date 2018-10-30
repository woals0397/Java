package ch03;

// 인터페이스
interface IntSequence{
    // 메서드들은 추상메서드로 작성하지만 필요에 따라 구현부를 작성할 수도 있다.
    // 인터페이스의 모든 메서드는 자동으로 public이 된다.
    boolean hasNext();
    int next();
    default String st(){
        return null;
    }
}

class SquareSequence implements IntSequence{ // IntSequence인터페이스를 구현한 클래스 정의
    private int i;

    @Override
    public boolean hasNext(){
        return true;
    }

    @Override
    public int next(){
        i++;
        return i * i;
    }
}

class DigitalSequence implements IntSequence{
    private int number;

    public DigitalSequence(int n){
        number = n;
    }

    @Override
    public boolean hasNext() {
        return number != 0;
    }

    @Override
    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

    public int rest(){
        return number;
    }
}


public class Ex01 {
    public static void main(String[] args) {
        // 인터페이스 타입으로 변환
        // 객체는 실제 클래스나 해당 클래스의 슈퍼타입으로만 타입 변환이 가능하다.
        IntSequence digits = new DigitalSequence(1729);
        double avg = average(digits, 100);

        // 객체 instanceof 타입 : 객체가 타입을 슈퍼타입으로 두고 있을 경우 true반환
        // if문 특성상 첫번째 if문만 실행되지만 digits는 두 타입 모두를 슈퍼타입으로 가진다.
        if(digits instanceof DigitalSequence){
            System.out.println("instanceof-DigtalSequence");
        }else if(digits instanceof IntSequence){
            System.out.println("instanceof-IntSequence");
        }
    }

    public static double average(IntSequence seq, int n){
        int count = 0;
        double sum = 0;
        while(seq.hasNext() && count < n){
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum/count;
    }
}
