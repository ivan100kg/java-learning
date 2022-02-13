package Lessons.Lesson13;

public class Employee {
    public static void main(String[] args) {
        String day = "monday";
        switch (day){
            case "monday":
            case "wednesday":
                System.out.println("Work up to 18:00");
                break;
            case "tuesday":
            case "thursday":
            case "friday":
                System.out.println("Work up to 16:00");
                break;
            case "saturday":
                System.out.println("Work up to 13:00");
                break;
            case "sunday":
                System.out.println("weekend");
                break;
            default:
                System.out.println("Wrong day of week");
        }
    }
}
