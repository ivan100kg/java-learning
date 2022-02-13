package Lessons.Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("bye");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();

        System.out.println(list.indexOf(sb1));
    }
}
