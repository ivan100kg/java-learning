package Lessons.Lesson14;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        int k = 1;
        for (; k > 0; k++, k-=2) {
            System.out.println(k);
        }

        for (int i = 0, j=0;i<10;i++){
            for(;j<10;j++){
                System.out.println(i+""+j);
            }
            j=0;
        }
    }
}
