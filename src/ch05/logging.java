package ch05;

import java.util.logging.Level;
import java.util.logging.Logger;

public class logging {
    public static void main(String[] args) {
        int a = 0;

        // 작성된 시점부터 log를 찍지 않는다.
        //Logger.global.setLevel(Level.OFF);
        a++;
        Logger.getGlobal().info("a:" + a);
        Logger.global.setLevel(Level.OFF);
        a--;
        Logger.getGlobal().info("a:" + a);
    }
}
