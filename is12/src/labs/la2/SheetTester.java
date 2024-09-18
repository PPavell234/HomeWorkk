package labs.la2;

public class SheetTester {
    public static void main(String[] args) {
        Sheet sheet = new Sheet();
        System.out.println("начальное значение ширины и высоты : Width=851, Height=118");
        System.out.println(" "+sheet.getName()+" "  + sheet.getWidth() + " " + sheet.getHeight());
        sheet = sheet.cutInHalf();
        System.out.println(" "+sheet.getName()+" "  + sheet.getWidth() + " " + sheet.getHeight());
        sheet = sheet.cutInHalf();
        System.out.println(" "+sheet.getName()+" "  + sheet.getWidth() + " " + sheet.getHeight());
        sheet = sheet.cutInHalf();
        System.out.println(" "+sheet.getName()+" "  + sheet.getWidth() + " " + sheet.getHeight());

    }
}
//reset,start,switch,time
