package Lessons.Lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("bye");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        list2.add(new StringBuilder("Burn!"));
        list2.add(new StringBuilder("in Hell!"));

        for (StringBuilder sb : list) {
            sb.append("!!!");
        }

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();

        list.remove(2);

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();

        list.remove(sb1);

        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();

        list.addAll(list2);
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();

        list2.get(0).reverse();
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();

        list2.remove(0);
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();


    }
}
