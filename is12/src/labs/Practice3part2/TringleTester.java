package labs.Practice3part2;

public class TringleTester {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,0);
        Point p3 = new Point(0,4);
        Task2_Triangle t1 = new Task2_Triangle(p1, p2, p3);
        System.out.println(t1.getLength1());
        System.out.println(t1.getLength2());
        System.out.println(t1.getLength3());
        System.out.println(t1.getPerimeter());
        double Angel1 = t1.getAngle1()/Math.PI*180;
        double Angel2 = t1.getAngle2()/Math.PI*180;
        double Angel3 = t1.getAngle3()/Math.PI*180;
        System.out.println(t1.getArea());

        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%10s%30s%20s\n","Номер","Длина","Угол");
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%10s%30s%20s\n","1" ,t1.getLength1(), Angel1);
        System.out.printf("%10s%30s%20s\n","2" ,t1.getLength2(), Angel2);
        System.out.printf("%10s%30s%20s\n","3" ,t1.getLength3(), Angel3 );
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Периметр  " + t1.getPerimeter());
        System.out.println("Площадь   " + t1.getArea());
        System.out.println("----------------------------------------------------------------------------");
    }
}
