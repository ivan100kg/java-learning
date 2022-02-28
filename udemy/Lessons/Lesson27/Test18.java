package Lessons.Lesson27;

public class Test18 {
    void abc() {
        System.out.println("abc");
        throw new StackOverflowError();
    }

    void def() {
        try {
            abc();
        } finally {
            System.out.println("Finally block");
        }
    }

    public static void main(String[] args) {
        Test18 t = new Test18();
        t.def();
    }
}
