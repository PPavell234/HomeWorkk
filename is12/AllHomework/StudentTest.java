package Exercises10;
import Exercises7.Student001;

public class StudentTest {

    public static void main(String[] args) {
        Student001 student1 = new Student001("000001", "Алеша", "Алексей", 2, 7, 8, 9);
        Student001 student2 = new Student001("000002", "Попов", "Петров", 3, 8, 9, 10);

        System.out.println("Сравнение студентов с помощью одного сравнения (Ratio):");
        Ratio(student1, student2);

        System.out.println("\nСравнение студентов с помощью сравнения (Ratio2):");
        Ratio2(student1, student2);
    }

    public static void Ratio(Student001 student1, Student001 student2) {
        if (student1.getName().equals(student2.getName()) &&
                student1.getSurname().equals(student2.getSurname()) &&
                student1.getYearOfStudy() == student2.getYearOfStudy() &&
                student1.getStudentId().equals(student2.getStudentId())) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    public static void Ratio2(Student001 student1, Student001 student2) {
        boolean sooth = true;

        if (!student1.getName().equals(student2.getName())) {
            System.out.println("Имена студентов не равны");
            sooth = false;
        }

        if (!student1.getSurname().equals(student2.getSurname())) {
            System.out.println("Фамилии студентов не равны");
            sooth = false;
        }

        if (student1.getYearOfStudy() != student2.getYearOfStudy()) {
            System.out.println("Год обучения студентов не равны");
            sooth = false;
        }

        if (!student1.getStudentId().equals(student2.getStudentId())) {
            System.out.println("ID студентов не равны");
            sooth = false;
        }

        if (sooth) {
            System.out.println("Студенты равны");
        }
    }
}
