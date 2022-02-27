package Lessons.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test9 {

    static void abc() throws FileNotFoundException {
        try {
            File f = new File("test101.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Caught exc 1");
            throw e;
        } finally {
            System.out.println("Finally");
        }
    }

    static void def() {
        throw new NullPointerException("Bla-bla");
    }

    static void foo() throws IOException {
        throw new FileNotFoundException("Bla");
    }

    public static void main(String[] args) {
        def();
//        foo();
    }
}
