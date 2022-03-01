package Lessons.Lesson27;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {
    public static void main(String[] args) throws Exception {
        Animal2 a = new Mouse();

    }
}

class Animal2 {
    Animal2() throws FileNotFoundException {

    }
}

class Mouse extends Animal2 {
    Mouse() throws IOException {
        super();
    }
}


class Human {
    String name;
    int age;

    Human(String name, int age) throws Exception {
        if (age < 0) {
            throw new Exception("Incorrect age");
        }
        this.name = name;
        this.age = age;
    }
}