package Tester;

public class Balloon {
    private double radius = 0;
    private double volume;

    public void inflate(double amount){
        radius = amount + radius;
        System.out.println("Шарик надуляся на "+ radius);

    }

    public void getVolume(){
        volume = ((double) 4.0 /3.0)*(Math.PI*radius);
        System.out.println("Объем равен "+volume);
    }


}
