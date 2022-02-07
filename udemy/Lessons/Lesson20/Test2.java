package Lessons.Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add("ok");
        list.add(0, "bye");
        list.add(1, "yo!");

        list.set(0, "Yaa!");

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        System.out.println(intList.get(0));


    }

}
