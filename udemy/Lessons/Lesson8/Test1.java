package Lessons.Lesson8;

public class Test1 {

    public int a = 20;
    public final int b = 40;    // сразу определяем

    public void abc(short s) {
        final byte b;   // локальные можно объявить так
        b=10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.a = t.a * 2;
//        t.b = t.b * 2;
        System.out.println(t.a);

    }
}
