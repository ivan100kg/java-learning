package Lessons.Lesson26;

public class Test5 {
    {
        System.out.println("Initializer block 3");
    }

    Test5() {
        System.out.println("Constructor 1");
    }

    Test5(int a) {
        this();
        System.out.println("Constructor 2");
    }

    {
        System.out.println("Initializer block 1");
    }

    static {
        System.out.println("Static block 1");
    }

    {
        System.out.println("Initializer block 2");
    }

    static {
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        Test5 t = new Test5(12);
    }
}
