package Practice_Exercises.chapterOne;


/**
 * Task 12
 */
public class EmployeeTester {


    public static void main(String[] args) {
        Employee harry = new Employee("Hacker, Harry", 50000);
        String name = harry.getName();
        System.out.println("Name: " + name);
        System.out.println("Expected: Hacker, Harry");
        double salary = harry.getSalary();
        System.out.println("Salary: " + salary);
        System.out.println("Expected: 50000");
        harry.raiseSalary(10);
        System.out.println("Raised salary: " + harry.getSalary());
        System.out.println("Expected: 55000.0");
    }

}
