package Lessons.Lesson21;

public class Test7 {
    public void abc(int a, double b){
        System.out.println("Hello");
    }

    public void abc(double a, int b){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.abc(1.0,2);
    }

}
