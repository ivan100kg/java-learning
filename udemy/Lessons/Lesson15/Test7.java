package Lessons.Lesson15;

public class Test7 {
    public static void main(String[] args) {
        int money = 0;

        do {
            System.out.println("Place a bet");
            System.out.println("You loose!");
            money -= 10;
        } while (money > 50);
    }
}
