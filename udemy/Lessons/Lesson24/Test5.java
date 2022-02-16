package Lessons.Lesson24;

public class Test5 {
    public static void main(String[] args) {
        Zz z = new Zz();
        z.abc();
        z.def();
    }
}

interface I1{
    void abc();
    default void def(){
        System.out.println("def method");
    }
}

interface I2 extends I1{
    void abc();
}

abstract class R implements I1{
    abstract public void abc();
}

class Zz implements I1{

    @Override
    public void abc() {
        System.out.println("abc method");
    }
}