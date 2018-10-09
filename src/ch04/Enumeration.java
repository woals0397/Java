package ch04;

//enum Size{ SMALL, MEDIUM, LARGE, EXTRA_LARGE}

enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

public class Enumeration {
    public static void main(String[] args) {
        Size notMySize = Size.valueOf("SMALL");
        System.out.println(notMySize);
        System.out.println(Size.MEDIUM);

        System.out.println("=======================");

        // 모든 값을 배열로 리턴
        Size[] allValues = Size.values();
        for(Size s : allValues)
            System.out.println(s);

        // 인덱스반환
        System.out.println(Size.LARGE.ordinal());

        System.out.println(notMySize.toString());

        System.out.println(Size.MEDIUM.compareTo(Size.LARGE));

        System.out.println(Size.SMALL.getAbbreviation());
    }
}
