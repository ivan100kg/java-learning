package Lesson6;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        mO.show(100);
    }
}


