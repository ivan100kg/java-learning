package Lessons.Lesson20;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(new Car());
        list.add(new Student());
        list.add(new StringBuilder("ok"));

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello!");
        list2.add("World");
        list2.add("!");

        ArrayList<Integer> li1 = new ArrayList<>();
    }
}

class Car {
}

class Student {
}