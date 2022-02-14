package Lessons.Lesson23;

public class Test6 {
}

class Animal2 {
    static String showName() {
        return "Some animal";
    }

    void showAnimalInfo() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse2 extends Animal2 {
    static String showName() {
        return "Jerry";
    }

    void showMouseInfo() {
        System.out.println("Name of mouse: " + showName());
    }


    public static void main(String[] args) {
        Mouse2 a = new Mouse2();
        a.showAnimalInfo();
        a.showMouseInfo();
    }
}