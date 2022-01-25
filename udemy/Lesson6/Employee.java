package Lesson6;

public class Employee {
    // constructor overloading
    public Employee(int id, String surname, int age, double salary, 
            String departament){
        System.out.println("0 constructor");        
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.departament = departament;
    }
    
    public Employee(int id, String surname, int age){
        this(id, surname, age, 0.0, null);
        System.out.println("1st constructor");        
//        this.id = id;
    }
    
    public Employee(String surname, int age){
        this(0, surname, age, 0.0, null);
        System.out.println("2nd constructor");
//        this.age = age;
    }
    
    public Employee(String surname){
        this(0, surname, 0, 0.0, null);
        System.out.println("3rd constructor");
//        this.surname = surname;
    }
    
    int id;
    String surname;
    int age;
    double salary;
    String departament;
    
    void showInfo(){
        System.out.println("id: "+ id);
        System.out.println("surname : "+ surname);
        System.out.println("age : "+ age);
        System.out.println("salary : "+ salary);
        System.out.println("departament : "+ departament);
                
    }
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bond", 67);
        emp1.showInfo();
        
        Employee emp2 = new Employee("Bob");
        emp2.showInfo();
        
        Employee emp3 = new Employee(1, "Henry", 34);
        emp3.showInfo();
        
    }
}