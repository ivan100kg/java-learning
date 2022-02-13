package Lessons.Lesson21;

public class Test4 {
    public void abc(String s) {
        System.out.println(s);
    }

    public void abc(boolean s) {
        System.out.println(s);
    }

    public void abc(int s) {
        System.out.println(s);
    }

    public StringBuilder abc(StringBuilder s) {
        System.out.println(s);
        return new StringBuilder("Bye");
    }

}
