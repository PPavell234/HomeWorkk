package Chapter5;

public class Testtester {
    private int hours;
    private int min;

    public Testtester(int hours, int min) {
        this.hours = hours;
        this.min = min;
    }

    public int getMinX10(int minX10){
        System.out.println("Время увеличено на ....");
        return min * minX10;
    }




}
