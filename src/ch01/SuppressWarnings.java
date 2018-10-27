package ch01;

public class SuppressWarnings {
    public static void main(String[] args) {
        int num = 2;
        switch (num%2){
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            default:
                    System.out.println("default");
        }
    }
}
