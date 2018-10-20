package ch05;

import java.util.Random;

class A{
    private static Random generator = new Random();

    public static int randInt(int low, int high){
        if(low > high)
            throw new IllegalArgumentException(String.format("low should be <= high but is %d and high is %d", low, high));
        return low + (int) (generator.nextDouble() + (high - low + 1));
    }
}

public class exceptEx {
    public static void main(String[] args) {
        System.out.println(A.randInt(20, 10));
    }
}
