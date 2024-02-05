import java.util.Scanner;
class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.age = 18;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age of person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a person object using default constructor
        Person person1 = new Person();
        person1.displayInfo();

        // Creating a person object using parameterized constructor
        Person person2 = new Person("John", 25);
        person2.displayInfo();
    }
}