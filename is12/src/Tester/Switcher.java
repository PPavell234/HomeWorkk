package Tester;

public class Switcher {
    private final int on=1;
    private final int off=0;
    private int status = 0;

    public void getFirstSwitchState(){
        status = 0;
    }

    public void getSecondSwitchState(){
        status = 1;
    }

    public void getLampState(){
        System.out.println(status + " Состояние");
    }

    public void Actual(){
        if (status == 1){
            System.out.println("Актуальное состояние 0");
        } else {
            System.out.println("Актуальное состояние 1");
        }

    }






}
