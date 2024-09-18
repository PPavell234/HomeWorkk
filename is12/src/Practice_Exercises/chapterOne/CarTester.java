package Practice_Exercises.chapterOne;

public class CarTester {
    public static void main(String[] args) {
        Car myHybrid = new Car(10);        // 10 mpg
        myHybrid.addGas(50);            // Tank 50 gallons
        myHybrid.drive(100);            // Drive 100 miles

        System.out.println(myHybrid.getGasInTank());
        System.out.println("Expected: 40");
    }

}