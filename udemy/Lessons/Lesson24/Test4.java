package Lessons.Lesson24;

public class Test4 {
    public static void main(String[] args) {
        BreatheAble b1 = new Human();
        BreatheAble b2 = new Animal();
        b1.jump();
        b2.jump();
    }
}


class Human implements BreatheAble {

    @Override
    public void jump() {
        System.out.println("Human jumps");
    }
}

class Animal implements BreatheAble {

    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface BreatheAble {
    void jump();
}

interface A2 {
    void abc();
}

interface B2 extends A2 {
    void def();
}

abstract class D implements B2 {

}

class G extends D implements A2 {

    public void abc() {

    }

    public void def() {

    }
}