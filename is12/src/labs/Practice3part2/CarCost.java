package labs.Practice3part2;

public class CarCost {
    private final double NEW_CAR_PRICE;
    private final double MILE_PER_YEAR;
    private final double GAS_PRICE;
    private final double MILE_PER_GALLON;
    private final double RESALE_PRICE;


    public CarCost(double NEW_CAR_PRICE, double MILE_PER_YEAR, double GAS_PRICE,
                   double MILE_PER_GALLON, double RESALE_PRICE) {

        this.NEW_CAR_PRICE = NEW_CAR_PRICE;
        this.MILE_PER_YEAR = MILE_PER_YEAR;
        this.GAS_PRICE = GAS_PRICE;
        this.MILE_PER_GALLON = MILE_PER_GALLON;
        this.RESALE_PRICE = RESALE_PRICE;

    }

    public double getCost() {

        return NEW_CAR_PRICE + MILE_PER_YEAR / MILE_PER_GALLON * GAS_PRICE - RESALE_PRICE;
    }

}
