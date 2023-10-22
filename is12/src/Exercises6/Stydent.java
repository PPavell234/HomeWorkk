package Exercises6;

import java.util.Arrays;

public class Stydent {
    private String studentId;
    private String name;
    private String surname;
    private int yearOfStudy;

    private double economicsGrade;
    private double foreignLanguageGrade;
    private double mathGrade;

    public Stydent(String studentId, String name, String surname, int yearOfStudy, double mathGrade, double economicsGrade, double foreignLanguageGrade) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
        this.mathGrade = mathGrade;
        this.economicsGrade = economicsGrade;
        this.foreignLanguageGrade = foreignLanguageGrade;
    }


    //Ускоряем вычислени оценок с помощью метода Arrays.stream
    public double getAverageGrade() {
        return Arrays.stream(new double[]{mathGrade, economicsGrade, foreignLanguageGrade})
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        //Выводим
        return "Студент: " +
                "Номер студенческого билета: " + studentId +
                ", Имя: " + name +
                ", Фамилия: " + surname +
                ", Год обучения: " + yearOfStudy +
                ", Средняя оценка: " + getAverageGrade();
    }
}

