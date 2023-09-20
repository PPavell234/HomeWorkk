package Exercises2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // Вопрос 1
        System.out.println("Какой заголовок у вашей любимой картины?"); //"Звездная ночь" (String)
        String title = scanner.nextLine();

        // Вопрос 2
        System.out.println("Кто был художником этой картины?"); //Кто был художником этой картины?
        String artist = scanner.nextLine();

        // Вопрос 3
        System.out.println("В каком году была создана эта картина?"); //1889 (int)
        int year = scanner.nextInt();

        // Вопрос 4
        System.out.println("Как называется музей, где можно увидеть эту картину?"); //Музей Ван Гога в Амстердаме (String)
        String museum = scanner.nextLine();
        scanner.nextLine();

        // Вопрос 5
        System.out.println("Какую технику художник использовал для создания этой картины?"); //Масляные краски (String)
        String technique = scanner.nextLine();

        // Вопрос 6
        System.out.println("Какая ширина этой картины в сантиметрах?"); // 73 (short)
        short width = scanner.nextShort();

        // Вопрос 7
        System.out.println("Какая высота этой картины в сантиметрах?");
        short height = scanner.nextShort(); // 92 (short)

        // Вопрос 8
        System.out.println("Какое количество байт занимает файл с изображением этой картины?");
        int fileSize = scanner.nextInt(); //256740 (int)

        // Вопрос 9
        System.out.println("Какой размер файла с изображением этой картины в килобайтах?");
        double fileSizeKB = scanner.nextDouble(); //250.9 (double)

        // Вопрос 10
        System.out.println("Какой код цвета используется для фона этой картины?");
        String backgroundColor = scanner.nextLine(); //#012345 (String)
        scanner.nextLine();

        // Вопрос 11
        System.out.println("Какая сумма в байтах занимают все цвета на этой карте?");
        int colorsSize = scanner.nextInt(); //524288 (int)

        // Вопрос 12
        System.out.println("Какой формат файла используется для хранения изображения этой картины?");
        String fileFormat = scanner.nextLine(); //JPEG (String)
        scanner.nextLine();

        // Вопрос 13
        System.out.println("Какое количество пикселей содержит это изображение по горизонтали?");
        int pixelsHorizontal = scanner.nextInt(); //1080 (int)

        // Вопрос 14
        System.out.println("Какое количество пикселей содержит это изображение по вертикали?");
        int pixelsVertical = scanner.nextInt(); //720 (int)

        // Вопрос 15
        System.out.println("Какое количество пикселей всего на этом изображении?");
        int totalPixels = scanner.nextInt(); //777600 (int)

        // Вопрос 16
        System.out.println("Какой объем памяти занимает это изображение в мегабайтах?");
        double imageMemory = scanner.nextDouble(); //2.359375 (double)

        // Вопрос 17
        System.out.println("Сколько байт занимает один пиксель на этом изображении?");
        byte pixelSize = scanner.nextByte(); //2 (byte)

        // Вопрос 18
        System.out.println("Какая максимальная глубина цвета используется на этом изображении?");
        byte maxColorDepth = scanner.nextByte(); //255 (byte)

        // Вопрос 19
        System.out.println("Какое количество оттенков серого содержит это изображение?");
        short grayScaleShades = scanner.nextShort(); //256 (short)

        // Вопрос 20
        System.out.println("Какая средняя интенсивность цвета на этом изображении?");
        double averageColorIntensity = scanner.nextDouble(); //127.5 (double)

        // Вывод ответов
        System.out.println("Заголовок: " + title);
        System.out.println("Художник: " + artist);
        System.out.println("Год создания: " + year);
        System.out.println("Музей: " + museum);
        System.out.println("Техника: " + technique);
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Размер файла: " + fileSize + " байт");
        System.out.println("Размер файла: " + fileSizeKB + " кб");
        System.out.println("Цвет фона: " + backgroundColor);
        System.out.println("Сумма цветов: " + colorsSize + " байт");
        System.out.println("Формат файла: " + fileFormat);
        System.out.println("Пиксели по горизонтали: " + pixelsHorizontal);
        System.out.println("Пиксели по вертикали: " + pixelsVertical);
        System.out.println("Всего пикселей: " + totalPixels);
        System.out.println("Объем памяти: " + imageMemory + " мб");
        System.out.println("Размер пикселя: " + pixelSize + " байт");
        System.out.println("Максимальная глубина цвета: " + maxColorDepth);
        System.out.println("Оттенки серого: " + grayScaleShades);
        System.out.println("Средняя интенсивность цвета: " + averageColorIntensity);
    }
}
