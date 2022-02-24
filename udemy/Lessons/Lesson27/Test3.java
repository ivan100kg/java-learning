package Lessons.Lesson27;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws Exception {
        File f = new File("test10a.txt");
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
        System.out.println(fis.read());

    }
}
