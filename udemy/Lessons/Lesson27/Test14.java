package Lessons.Lesson27;

import java.io.*;

public class Test14 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test10.txt");
            System.out.println("fis1 exist");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("fis2 can't close");
            }

        } catch (FileNotFoundException e) {
            System.out.println("fis1 doesn't exist");
        } catch (NullPointerException e) {
            System.out.println("null pointer exc");
        }
    }
}
