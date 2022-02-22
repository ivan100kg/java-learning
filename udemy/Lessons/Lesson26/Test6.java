package Lessons.Lesson26;

public class Test6 {
    int a = 3;

    Test6() {
        a = 4;
    }

    {
        a = 5;
    }

//    public static void main(String[] args) {
//        Test6 t = new Test6();
//        System.out.println(t.a);
//    }
}

class A {
    static final int b;

    static {
        b = 10;
    }
}

class B {
    static int c;
    static final int d;
    static final int e = 1;

    static {
        c = 5;
        d = 10;
    }
}

class C {
    String s = "ok";
    static int i = 0;

    {
        System.out.println(s);
    }

    static {
        System.out.println(i);
    }

    {
        System.out.println(++i);
    }

    C() {
        System.out.println("Constructor");
    }

//    public static void main(String[] args) {
//        System.out.println("WTF?");
//        C c = new C();
//    }
}

class D {
    static {
        abc(2);
    }

    static void abc(int a) {
        System.out.println(a + " ");
    }

    D() {
        abc(5);
    }

    static {
        abc(4);
    }

    {
        abc(6);
    }

    static {
        new D();
    }

    {
        abc(8);
    }

    public static void main(String[] args) {
        D d = new D();
    }
}
