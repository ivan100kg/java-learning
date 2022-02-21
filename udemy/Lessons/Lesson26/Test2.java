package Lessons.Lesson26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);    // autoboxing
        Long l = 50L;
        Integer i = 50;
        Boolean b = true;

        int a = list.get(0);    // unboxing

        String s1 = "50";
        int i1 = Integer.parseInt(s1);
        System.out.println(s1);

        double d = Double.parseDouble("2.72");

        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf("100");
        Double d3 = Double.valueOf(3.14);
        Double d4 = Double.valueOf("1.42");
        System.out.println(i3 + " " + i4 + " " + d3 + " " + d4);
    }
}
