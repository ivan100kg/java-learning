package Lessons.Lesson27;

import java.io.*;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("test10.txt");
            System.out.println("File object is created");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream is created");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Reading...");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("1 exc");
        } catch (IOException e) {
            System.out.println("2 exc");
        } finally {
            System.out.println("Finally");
            System.out.println(result);
        }
    }
}
