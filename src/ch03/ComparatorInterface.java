package ch03;

import java.util.Arrays;

interface Comparator<T>{
    int compare(T first, T second);
}

// String문자열 길이로 비교
class LengthComparator implements Comparator<String>{
    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        Comparator<String> comp = new LengthComparator();

        String[] friends = {"Peter", "Paul", "Mary"};
        //Arrays.sort(friends, new LengthComparator());
    }
}
