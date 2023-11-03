package Exercises7;


public class Student001 {
    private String studentId;
    private String name;
    private String surname;
    private int yearOfStudy;
    private double averageGrade;

    public Student001(String studentId, String name, String surname, int yearOfStudy, double mathGrade, double economicsGrade, double foreignLanguageGrade) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
        this.averageGrade = (mathGrade + economicsGrade + foreignLanguageGrade) / 3;
    }


    @Override
    public String toString() {
        //Выводим
        return "Студент: " +
                "Номер студенческого билета: " + studentId +
                ", Имя: " + name +
                ", Фамилия: " + surname +
                ", Год обучения: " + yearOfStudy;


    }

    // Метод, который возвращает среднюю арифметическую оценку студента
    public double getAverageGrade() {
        return averageGrade;
    }

    // Метод, который возвращает имя студента
    public String getName() {
        return name;
    }

    // Метод, который возвращает фамилию студента
    public String getSurname() {
        return surname;

    }

}
class StudentTest001 {
    public static void main(String[] args) {
        Student001 student1 = new Student001("000001", "Алеша", "Алексей", 2, 7, 8, 9);
        Student001 student2 = new Student001("000002", "Попов", "Петров", 3, 8, 9, 10);
        Student001 student3 = new Student001("000003", "Максим", "Сергеев", 2, 9, 10, 11);

        printAverageGrade(student1);
        printAverageGrade(student2);
        printAverageGrade(student3);


    }

    public static void printAverageGrade(Student001 student) {
        System.out.println("Средняя арифметическая оценка студента " + student.getName() + " " + student.getSurname() + " = " + student.getAverageGrade());

    }
}







