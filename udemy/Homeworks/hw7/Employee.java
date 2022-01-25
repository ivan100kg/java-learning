package Homeworks.hw7;


public class Employee{
    public Employee(int id, String surname,int age, double salary, String departament){
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.departament = departament;
    }

    Employee(int id, String surname,int age, double salary){
        this(id,surname,age,salary,null);
    }

    private Employee(){
        this(0,null,0,0.0,null);
    }
    
    int id;
    public String surname;
    int age;
    private double salary;
    String departament;
    
    double doubleSalary(){
        return salary*=2;
    }
    
    public void showSalary(){
        System.out.println("salary: "+salary);
    }
    
    public void showSurname(){
        System.out.println("surname: "+surname);
    }
    
    public void showId(){
        System.out.println("id: "+id);
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
        e2.showSalary();
        e2.showId();
        e2.showSurname();

        
    }
}


