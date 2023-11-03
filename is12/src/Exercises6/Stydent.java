package Exercises6;

import java.util.Arrays;

public class Stydent {

    private String studentId;
    private String name;
    private String surname;
    private int yearOfStudy;
    private double averageGrade;

    public Stydent(String studentId, String name, String surname, int yearOfStudy, double mathGrade, double economicsGrade, double foreignLanguageGrade) {
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
                ", Год обучения: " + yearOfStudy +
                ", Средняя оценка: " + averageGrade;
    }
}

