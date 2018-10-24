package ch01;

public class Infinity {
    public static void main(String[] args) {
        System.out.println(Double.POSITIVE_INFINITY);   // = 1.0 / 0.0
        System.out.println(Double.NEGATIVE_INFINITY);   // = -1.0 / 0.0
        System.out.println(Double.NaN);                 // = 0.0 / 0.0
        System.out.println(Double.POSITIVE_INFINITY + Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY - Double.NEGATIVE_INFINITY);
        System.out.println(Double.isNaN(0.0));

        System.out.println(Integer.valueOf(9) / 0);
        System.out.println(Double.valueOf(9.0) / 0);
    }
}
