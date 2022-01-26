package Lesson7;

public class Employee {
    protected double salary;
    
    public void doubleSalary(){
        double result = salary*2;
        System.out.println("New salary is: "+ result);
    }
    
    public Employee(double salary){
        this.salary = salary;
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee(200);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}

class EmpTest{
    public static void main(String[] args) {
        Employee emp = new Employee(200);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }
}