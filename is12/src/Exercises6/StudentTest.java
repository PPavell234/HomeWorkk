package Exercises6;

public class StudentTest {
    public static void main(String[] args) {

        // 3 объекта
        Stydent student1 = new Stydent("000001","Иван","Иванов",1,7,8,9);
        Stydent student2 = new Stydent("000002","Петр","Петров",2,8,9,10);
        Stydent student3 = new Stydent("000003","Сергей","Сергеев",3,9,10,11);

        // Выводим оценку каждого студента
        System.out.println(student1.getAverageGrade());
        System.out.println(student2.getAverageGrade());
        System.out.println(student3.getAverageGrade());
    }
}
