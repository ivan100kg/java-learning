package Lessons.Lesson24;

public class Test5 {
    public static void main(String[] args) {
        Zz z = new Zz();
        z.abc();
        z.def();
    }
}

interface I1 {
    static void foo() {
        System.out.println("static");
    }

    void abc();

    default void def() {
        System.out.println("def method");
    }
}

interface I2 extends I1 {
    void abc();
}

abstract class R implements I1 {
    public static void main(String[] args) {
        I1.foo();
    }
}

class Zz implements I1 {

    @Override
    public void abc() {
        System.out.println("abc method");
    }

    I1 Ret() {
        return new Zz();
    }
}