package Lessons.Lesson23;

public class Test4 {
    void foo(Animal a) {
        System.out.println("A");
    }

    void foo(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        Animal an = new Mouse();
        t.foo(an);
    }

}

class Animal {
    void showName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    void showName() {
        System.out.println("Mouse");
    }
}
