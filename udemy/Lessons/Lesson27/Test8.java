package Lessons.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {

    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("5");
        try {
            File f = new File("test101.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Caught exc 1");
            return a;
        } finally {
            a.append("100");
            System.out.println("Finally");
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
