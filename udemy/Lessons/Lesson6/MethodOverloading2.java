package Lessons.Lesson6;

public class MethodOverloading2 {
    protected int sum(int a, int b){
        return a+b;
    }
    
    public String sum(String a, String b){
        return a+b;
    }
}

class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();
        
        System.out.println(mO2.sum(5, 7));
        System.out.println(mO2.sum("Hi", " There!"));
    }
}