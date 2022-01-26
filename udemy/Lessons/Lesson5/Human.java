package Lessons.Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;
    
    void info(){
        System.out.println("Name: " + name);
        System.out.println("Car: " + car.color + " " + car.engine);
        System.out.println("BankAccount: " + bA.id + " " + bA.balance);
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Ivar";
        h.car = new Car3("red", "V6");
        h.bA = new BankAccount(123456, 1320000);
        h.info();
    }
}

class Car3{
    Car3(String c, String e){
        color = c;
        engine = e;
    }
    
    String color;
    String engine;
}


class BankAccount{
    BankAccount(int id, int balance){
        this.id = id;
        this.balance = balance;
    }
    int id;
    double balance;
}