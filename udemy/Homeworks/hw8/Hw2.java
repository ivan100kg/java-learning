package Homeworks.hw8;

public class Hw2 {
    static final float pi = 3.14f;

    double circleSquare(float r) {
        return pi * r * r;
    }
    
    static double circumferenceLength(float r) {
        return 2 * pi * r;
    }

    void show(float r) {
        System.out.println("Radius: "+r);
        System.out.println("Circle Square: "+circleSquare(r));
        System.out.println("Circumference Length: "+circumferenceLength(r));
    }
    
}

class TestHw2{
    public static void main(String[] args) {
        Hw2 hw = new Hw2();
        System.out.println(hw.circleSquare(3));
        System.out.println(Hw2.circumferenceLength(3));
        hw.show(1);
    }
}
