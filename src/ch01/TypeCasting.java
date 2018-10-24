package ch01;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println(3.14 + 42);      // 45.14  double + int = double + double
        System.out.println(3.14f + 42);     // 45.14  float + int = float + float
        System.out.println('J' + 1);        // 75     char + int = int + int
        System.out.println('J' + 3.5);      // 77.5   char + double = double + double
        System.out.println('J' + (byte)1);  // 75     char + byte = int + int
    }
}
