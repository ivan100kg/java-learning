package Lessons.Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figure f1 = new Square(5);
        f1.plo();
        System.out.println(f1.fridge);
        Circle c1 = new Circle(12);
        System.out.println(c1.fridge);
    }
}

abstract class Figure {
    Figure(int fridge) {
        this.fridge = fridge;
    }

    int fridge = 0;

    abstract void per();

    abstract void plo();

    void showInfo() {
        System.out.println("This is figure");
    }
}

class Square extends Figure {
    Square(int fridge) {
        super(fridge);
    }

    int fridge = 4;
    int lenA = 10;

    public void per() {
        System.out.println("P of square with a: " + lenA + " = " + lenA * 4);
    }

    void plo() {
        System.out.println("S of square with a: " + lenA + " = " + lenA * lenA);
    }
}

class Rectangle extends Figure {
    Rectangle(int fridge) {
        super(fridge);
    }

    int fridge = 4;
    int lenA = 8;
    int lenB = 5;

    public void per() {
        System.out.println("P of rectangle with a: " + lenA + " and b: " + lenB + " = " + (lenA + lenB) * 2);
    }

    void plo() {
        System.out.println("S of rectangle with a: " + lenA + " and b: " + lenB + " = " + lenA * lenB);
    }
}

class Circle extends Figure {
    Circle(int fridge) {
        super(fridge);
    }

    int fridge = 0;
    int rad = 3;

    public void per() {
        System.out.println("P of circle with r: " + rad + " = " + 2 * 3.14 * rad);
    }

    void plo() {
        System.out.println("S of circle with r: " + rad + " = " + 3.14 * rad * rad);
    }
}

abstract class Hexo extends Figure {
    Hexo(int fridge) {
        super(fridge);
    }

    void def() {
        System.out.println("This is hexo");
    }
}