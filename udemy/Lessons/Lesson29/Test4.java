package Lessons.Lesson29;

public class Test4 {
    static void def(It i) {
        i.abc();
    }

    public static void main(String[] args) {
        def(() -> {});
    }
}

interface It{
    void abc();
}
