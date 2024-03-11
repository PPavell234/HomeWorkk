package Tester;

public class RangeInput {
    private double up;
    private double down;
    private String status;

    public RangeInput(double up, double down) {
        this.up = up;
        this.down = down;
    }

    public double UpTepcher(){
        System.out.println(up+10);

        return up;
    }
    public void DownTepcher(){
        down=down-10;
        System.out.println("Температура"+down);
        if (down==0){
            System.out.println("Температура не должна превышать ноль");
        }else {
            System.out.println("Температура уже превышает ноль");
        }
    }

    public String getStatus(){
        System.out.println("Температура: "+ up + "Температура: " + down);
        return null;
    }


}
