package Exercises8;

public class Employee {
    private double salary;
    public String surname;
    protected int id;

    // Конструктор с параметрами
    public Employee(double salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    // Default конструктор
    Employee(String surname) {
        this.surname = surname;
    }

    // Private конструктор
    private Employee(int id) {
        this.id=id;
    }

    public void showSalary() {
        System.out.println("Зарплата: " + salary);
    }

    public void showSurname() {
        System.out.println("Фамилия: " + surname);
    }

    public void showId() {
        System.out.println("ID: " + id);
        // ...
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee(100000, "Иванов", 1);
        employee1.showSalary();
        employee1.showSurname();
        employee1.showId();

        Employee employee2 = new Employee("Петров");
        employee2.showSurname();

    }

}