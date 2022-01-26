
package Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;      
}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();   // new object
        BankAccount YourAccount = new BankAccount(); // new object
        BankAccount HisAccount = new BankAccount();  // new object
        
        MyAccount.id = 1;
        MyAccount.name = "Vasya";
        MyAccount.balance = 12.29;
        
        System.out.println(MyAccount.id);
        System.out.println(MyAccount.name);
        System.out.println(MyAccount.balance);
    }
}