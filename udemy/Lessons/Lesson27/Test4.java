package Lessons.Lesson27;

import java.io.*;

public class Test4 {
    void abc() throws FileNotFoundException{
        File f = new File("test10.txt");
//        try {
//            FileInputStream fis = new FileInputStream(f);
//        } catch (FileNotFoundException e) {
//            System.out.println("Exception was caught " + e);
//        }
        FileInputStream fis = new FileInputStream(f);

    }

    void def() {
        System.out.println("Hi");
        try {
            abc();
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception was caught " + e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
//        File f = new File("test10.txt");
//
//        try {
//            FileInputStream fis = new FileInputStream(f);
//            System.out.println("Hello!");
//        } catch (FileNotFoundException e) {
//            System.out.println("Exception was caught " + e);
//        } catch (Throwable e) {
//            System.out.println("Any throwable");
//        } finally {
//            System.out.println("Good day!");
//        }
//        System.out.println("After block");
        Test4 t = new Test4();
        t.def();
        t.abc();
    }
}
