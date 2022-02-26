package Lessons.Lesson27;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File("test101.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Caught exc 1");
        } catch (Exception e) {
            System.out.println("Caught exc 3");
        } catch (Throwable e) {
            System.out.println("Caught exc 4");
        }

    }
}
