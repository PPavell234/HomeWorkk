package Exercises7;

public class Employee {
    private int id;
    private String surname;
    private int age;
    double salary;
    private String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public void increaseSalary() {
        salary *= 2;
    }


}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(345345, "Иванов", 30, 45456546, "DDA");
        Employee employee2 = new Employee(3454353, "Петров", 25, 45656664, "YYA");


        employee1.increaseSalary();
        System.out.println("Увеличение зарплаты сотрудника 1: " + employee1.salary);

        employee2.increaseSalary();
        System.out.println("Увеличение зарплаты сотрудника 2 " + employee2.salary);
    }
}
