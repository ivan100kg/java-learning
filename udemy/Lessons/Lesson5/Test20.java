
package Lessons.Lesson5;

public class Test20 {
    int sum(int a, int b, int c){
        int result = a+b+c;
        return result;
    }
    
    int average(int a, int b, int c){
        return sum(a,b,c)/3;
    }
}

class Test21{
    public static void main(String[] args) {
        Test20 t = new Test20();
        int s = t.sum(1, 2, 3);
        System.out.println(s);
        System.out.println(t.sum(4, 5, 6));
        System.out.println(t.average(4, 5, 6));
    }
}