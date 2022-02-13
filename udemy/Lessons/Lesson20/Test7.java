package Lessons.Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("C");
        list.add("B");
        list.add("D");
        list.add("A");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
