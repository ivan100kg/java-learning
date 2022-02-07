package Lessons.Lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("bye");

        ArrayList<StringBuilder> list1 = new ArrayList<>();

        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        ArrayList<StringBuilder> list2 = list1;
        ArrayList<StringBuilder> list3 = (ArrayList<StringBuilder>) list1.clone();

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        list3.get(0).append("!!!");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        list3.set(0, sb3.append("+++"));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        Object[] arr = list1.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }

        list3.get(1).append("+");
        StringBuilder[] sb_arr = list1.toArray(new StringBuilder[0]);
        for (StringBuilder sb : sb_arr) {
            System.out.println(sb);
        }

        list3.get(1).append("*");
        List<StringBuilder> l1 = Arrays.asList(sb_arr);
        for (StringBuilder sb : l1) {
            System.out.println(sb);
        }

        System.out.println(Arrays.toString(sb_arr));
        System.out.println(l1);
    }
}
