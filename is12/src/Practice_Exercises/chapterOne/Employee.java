package Practice_Exercises.chapterOne;

/**
 *Task 12
 */

public class Employee
{
    private String name;
    private double salary;

    // Constructors
    /**
     * Constructs an object employee with a name and a salary
     * @param employeeName name of employee
     * @param currentSalary salary of employee
     */
    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }

    // Methods
    /**
     * Gets the name of employee
     * @return name of employee
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the salary of employee
     * @return salary of employee
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     * Raises salary by a certain percentage
     * @param byPercent percent salary raise
     */
    public void raiseSalary(double byPercent)
    {
        double raise = byPercent / 100.0;
        salary = (salary * raise) + salary;
    }
}
