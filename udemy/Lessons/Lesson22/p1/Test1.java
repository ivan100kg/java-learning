package Lessons.Lesson22.p1;
import Lessons.Lesson22.Human;

public class Test1 {
    public static void main(String[] args) {
        Human h = new Human("M");
        h.setAge(39);
        h.setName(new StringBuilder("Ivan"));
        h.setWeight(99);
        h.showInfo();
    }
}
