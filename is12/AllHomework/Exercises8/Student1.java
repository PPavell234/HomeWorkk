package Exercises8;

public class Student1 {
    String studentId;
    String name;
    String surname;
    int yearOfStudy;
    double averageGrade;

    public Student1(String studentId, String name, String surname, int yearOfStudy, double mathGrade, double economicsGrade, double foreignLanguageGrade) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
        this.averageGrade = (mathGrade + economicsGrade + foreignLanguageGrade) / 3;
    }

    public Student1(String studentId, String name, String surname, int yearOfStudy) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
        this.averageGrade = 0;
    }

    public Student1() {
        this.studentId = "";
        this.name = "";
        this.surname = "";
        this.yearOfStudy = 0;
        this.averageGrade = 0;
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student1 student1 = new Student1("123456", "Иван", "Иванов", 1, 5, 4, 3);
        Student1 student2 = new Student1("789012", "Петр", "Петров", 2);
        Student1 student3 = new Student1();

        System.out.println("Студент 1: ");
        printStudent(student1);

        System.out.println("\nСтудент 2: ");
        printStudent(student2);

        System.out.println("\nСтудент 3: ");
        printStudent(student3);
    }

    //метод принимает в качестве параметра объект класса Student1 и выводит на консоль значения всех его полей.
    private static void printStudent(Student1 student) {
        System.out.println("studentId: " + student.studentId);
        System.out.println("name: " + student.name);
        System.out.println("surname: " + student.surname);
        System.out.println("yearOfStudy: " + student.yearOfStudy);
        System.out.println("averageGrade: " + student.averageGrade);
    }
}
