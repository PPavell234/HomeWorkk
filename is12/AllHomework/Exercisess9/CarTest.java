package Exercises9;

public class CarTest {



    public static void main(String[] args) {
        Car car1 = new Car("Голубой", "Zeekr 001", 4);
        Car car2 = new Car("Фиолетовый", "Lada Vesta", 4);

        System.out.println("Изначально:");
        System.out.println(car1);
        System.out.println(car2);

        //Двери
        changeDoors(car1, 5);
        //Цвет
        swapColors(car1, car2);

        System.out.println("\n После вызова методов:");
        System.out.println(car1);
        System.out.println(car2);
    }

    public static void changeDoors(Car car, int newDoors) {
        car.setDoors(newDoors);
    }

    public static void swapColors(Car car1, Car car2) {
        String tempColor = car1.getColor();
        car1.setColor(car2.getColor());
        car2.setColor(tempColor);
    }
}