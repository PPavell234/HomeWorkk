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
        this.id = id;
    }

    public void SSalary() {
        System.out.println("Зарплата: " + salary);
    }

    public void SSurname() {
        System.out.println("Фамилия: " + surname);
    }

    public void Id() {
        System.out.println("ID: " + id);

    }

    public static void main(String[] args) {

        Employee employee1 = new Employee(100000, "Ivan", 23);
        employee1.SSalary();
        employee1.SSurname();
        employee1.Id();

        Employee employee2 = new Employee("PiT");
        employee2.SSurname();

    }

}