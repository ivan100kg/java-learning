package Lessons.Lesson30;

public class Test1 {
    public static void main(String[] args) {
        B b  = new B();
        System.out.println(((A) b).a);
    }
}

class A{
    public int a = 10;
    public void abc() {
        System.out.println("base non-static");
    }
    public static void abc2() {
        System.out.println("base static");
    }
}

class B extends A{
    public int a = 20;
    public void abc() {
        System.out.println("child non-static");
    }
    public static void abc2() {
        System.out.println("child static");
    }
}

