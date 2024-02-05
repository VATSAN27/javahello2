
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

n
class Employee extends Person {
    int employeeId;
    double salary;

    /
    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age); // Initialize Person attributes using super keyword
        this.employeeId = employeeId;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John Doe", 30, 12345, 50000.0);


        System.out.println("Employee Name: " + employee1.name);
        System.out.println("Employee Age: " + employee1.age);
        System.out.println("Employee ID: " + employee1.employeeId);
        System.out.println("Employee Salary: $" + employee1.salary);
    }
}