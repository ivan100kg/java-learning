package Lessons.Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add("ok");

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println(list.indexOf("ok"));
        System.out.println(list.contains("ok"));
        System.out.println(list);
    }
}
