package Lessons.Lesson26;

public class Test4 {
    static void abc(String s) {
        System.out.println("A");
    }

    static void abc(String... s) {
        System.out.println("B");
    }

    static void abc(Object s) {
        System.out.println("C");
    }

    static void abc(String s1, String s2) {
        System.out.println("D");
    }

    static void def(Long l) {
        System.out.println("E");
    }

    static void def(Long... l) {
        System.out.println("F");
    }

    static void def(long l) {
        System.out.println("G");
    }

    static void def(Object l) {
        System.out.println("H");
    }

    static void def(Integer l) {
        System.out.println("I");
    }


    public static void main(String[] args) {
//        abc("ok", "!!!");
        def(50);
    }

}
