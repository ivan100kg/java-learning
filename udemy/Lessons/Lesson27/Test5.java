package Lessons.Lesson27;

public class Test5 {
    static void abc() {
        System.out.println("Recursion");
        abc();
    }

    public static void main(String[] args) {
        abc();
    }
}
