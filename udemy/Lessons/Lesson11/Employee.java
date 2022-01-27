package Lessons.Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double dblNum(double a) {
        a = a*2;
        return a;
    }

    public double dblNum2() {
        return salary*=2;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Igor", 100.55);
        double d = emp1.dblNum(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.dblNum2();
        System.out.println(emp1.salary);
    }
}
