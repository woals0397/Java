package ch03;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.util.function.Predicate;

public class LambdaExpression {
    public static void main(String[] args) {
        Comparator<String> a = (String first, String second) -> {
            int difference = first.length() - second.length();
            if(difference < 0) return -1;
            else if(difference > 0) return 1;
            else return 0;
        };

        //EventHandler<ActionEvent> listener = event -> System.out.println("Oh noes!");
        //Predicate
    }
}
