package Lessons.Lesson21;

public class Test6 {
    int abc() {
        return 5;
    }

    int abc2(int i) {
        if (i > 10) return 5;
        else return 10;
    }

    void abc3(int i2) {
        if (i2 > 3) return;
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        int a = new Test6().abc();
        new Test6().abc();
        new Test6().abc2(12);


    }
}
