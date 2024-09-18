package chapterFour;


public class DispalyerProperiesPaper {

    public static void main(String[] args) {
        final double MILLIMETER_PAPER = 25.4;
        final double LENGHT_PAPER = 8.5;
        final double HEIGHT_PAPER = 11;
        double lengthMillemetr = Math.round(MILLIMETER_PAPER * LENGHT_PAPER);
        double heightMillimetr = MILLIMETER_PAPER * HEIGHT_PAPER;
        double perimeter = (2 * LENGHT_PAPER) + (2 * HEIGHT_PAPER);
        System.out.println("Периметр листа :" + perimeter);
        System.out.println("Длина : " + lengthMillemetr);
        System.out.println("Высота :" + heightMillimetr);
    }
}
