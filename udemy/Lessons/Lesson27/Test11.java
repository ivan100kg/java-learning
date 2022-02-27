package Lessons.Lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {
    FileInputStream fis1;
    FileInputStream fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test10.txt");
            try {
                fis2 = new FileInputStream("test100.txt");
            } catch (FileNotFoundException e) {
                System.out.println("IN try");
            }
        } catch (FileNotFoundException e) {
            System.out.println("OUT try");
        } finally {
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Caught IOException " + e);
            }
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.abc();
    }
}
