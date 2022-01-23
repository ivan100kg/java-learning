package Homeworks;

public class Lesson5 {
//    public static void main(String[] args) {
//        BankAccount bA = new BankAccount(1408, "Ivan", 1200000);
//        bA.checkBalance();
//        bA.putMoney(2000);
//        bA.checkBalance();
//        bA.withdrawMoney(100);
//        bA.checkBalance();
//    }
}

class BankAccount {    
    BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    int id;
    String name;
    double balance;
    
    void putMoney(double money) {
        balance += money;
    }
    
    void withdrawMoney(double money){
        if (money <= balance) balance -= money;
    }
    
    void checkBalance(){
        System.out.println("Balance: " + balance);
    }
}


class Employee{
    Employee(int id, String surname,int age, double salary, String departament){
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.departament = departament;
    }
    
    int id;
    String surname;
    int age;
    double salary;
    String departament;
    
    double doubleSalary(){
        return salary*=2;
    }
    
    void showSalary(){
        System.out.println(surname + "'s salary: "+salary);
    }
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee(1234,"Bond",67,60000,"MI6");
        Employee e2 = new Employee(1256,"Looser",35,1200,"Mail.ru");
        e1.doubleSalary();
        e1.showSalary();
        e2.doubleSalary();
        e2.showSalary();
    }
}