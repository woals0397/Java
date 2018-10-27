package ch01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String data = input.nextLine();
        String[] output = data.split(" ");
        for(int i = 0; i < output.length; i++)
            System.out.print(output[i]);
        input.close();
    }
}
