package Lessons.Lesson14;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 2; i <= 30; i += 2) {
            System.out.println(i);
            if (i == 20){
                System.out.println("break");
                break;
            }
        }
        System.out.println("");
        for (int i = 2; i <= 30; i += 2) {
            if (i >= 10 && i <= 20){
                System.out.println("continue");
                continue;
            }
            System.out.println(i);

        }


    }
}
