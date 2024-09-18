package Chatpter4;

public class TesterPyramid {
    public static void main(String[] args) {

        PyramidNew sample = new PyramidNew(10, 10);
        String resultOne = String.format("%.2f",sample.getVolume());
        String resultTwo = String.format("%.0f",sample.getSurfaceArea());
        System.out.println(resultOne);
        System.out.println("Expected: 333.33");
        System.out.println(resultTwo);
        System.out.println("Expected: 224");


    }
}
