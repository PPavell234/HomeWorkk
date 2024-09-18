package labs.Practice3part2;

public class Task2_Triangle {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;


    public Task2_Triangle(Point point1, Point point2, Point point3) {

        x1 = point1.getX();
        y1 = point1.getY();
        x2 = point2.getX();
        y2 = point2.getY();
        x3 = point3.getX();
        y3 = point3.getY();

    }

    public double getLength1() {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

    }

    public double getLength2() {
        return Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
    }

    public double getLength3() {
        return Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
    }

    public double getPerimeter() {

        return this.getLength1() + this.getLength2() + this.getLength3();
    }

    public double getAngle3() {

        return Math.acos((this.getLength1() * this.getLength1() + this.getLength2() * this.getLength2()
                - this.getLength3() * this.getLength3()) / (2.0 * this.getLength1() * this.getLength2()));
    }

    public double getAngle2() {

        return Math.acos((this.getLength1() * this.getLength1() + this.getLength3() * this.getLength3()
                - this.getLength2() * this.getLength2()) / (2.0 * this.getLength1() * this.getLength3()));
    }

    public double getAngle1() {

        return Math.acos((this.getLength3() * this.getLength3() + this.getLength2() * this.getLength2()
                - this.getLength1() * this.getLength1()) / (2.0 * this.getLength3() * this.getLength2()));
    }

    public double getArea() {

        return this.getLength1() * this.getLength2() * Math.sin(this.getAngle3()) / 2;
    }
}
