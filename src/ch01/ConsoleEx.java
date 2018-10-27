package ch01;

import java.io.Console;

public class ConsoleEx {
    public static void main(String[] args) {
        Console terminal = System.console();
        String username = terminal.readLine("User name: ");
        char[] passwd = terminal.readPassword("Password: ");

        //System.out.println(passwd);


    }
}
