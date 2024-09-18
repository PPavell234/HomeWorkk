package labs.la2;

public class StudentTester2 {

    public static void main(String[] args) {

        Student2 Nikita = new Student2("Никита");

        Nikita.test(70);
        Nikita.test(44);
        Nikita.test(50);

        System.out.println("Получает общий балл, набранный студентом во всех тестах. "+Nikita.getTotalScore());
        System.out.println("Cредний балл студента по всем тестам. "+Nikita.getAverage());


    }

}