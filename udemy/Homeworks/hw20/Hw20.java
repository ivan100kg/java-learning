package Homeworks.hw20;

import java.util.ArrayList;
import java.util.Collections;

public class Hw20 {
    public static ArrayList<String> abc(String... sArr) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : sArr) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        Collections.sort(result);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        abc("A", "J", "Z", "B", "Z");
        abc("X", "C", "P", "O", "D", "C");
        abc("B", "B");
        abc();
    }
}
