package Homeworks.hw13;

public class Month {
    int month;

    Month(int month){
        this.month = month;
    }

    public int getCountOfDays(){
        // data for 2015 year
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 0;

        }
    }

    public static void main(String[] args) {
        Month m = new Month(2);
        System.out.println(m.getCountOfDays());
    }
}
