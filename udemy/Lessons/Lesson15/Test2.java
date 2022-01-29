package Lessons.Lesson15;

public class Test2 {
    public static void main(String[] args) {
        int money = 100;

        while (money > 0) {
            System.out.println("Place а bet");
            System.out.println("U loose!");
            money -= 10;
            System.out.println("I have " + money + " $");
        }
    }
}
