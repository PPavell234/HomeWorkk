package labs.Practice4Part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Что вы хотите ввести? Длину волны или частоту?");
        String tableName = scanner.nextLine();

        if (tableName.equalsIgnoreCase("длину волны") || tableName.equalsIgnoreCase("волна")) {
            System.out.println("В какой степени вы хотите ввести10^x ");
        } else if (tableName.equalsIgnoreCase("частоту") || tableName.equalsIgnoreCase("частоту")) {
            System.out.println("В какой степени вы хотите ввести3 *10^x ");
        } else {
            System.out.println("Unknown table name");
            return;
        }

        System.out.println("Введите значение:");
        int numberVariable = scanner.nextInt();

        Map<Integer, String> frequencyRanges = new HashMap<>();
        frequencyRanges.put(0, "Крайне и сверх низкие");
        frequencyRanges.put(2, "Низкие");
        frequencyRanges.put(4, "Длинные");
        frequencyRanges.put(5, "Средние");
        frequencyRanges.put(6, "Короткие");
        frequencyRanges.put(7, "Ультра короткие");
        frequencyRanges.put(8, "Микроволны");
        frequencyRanges.put(12, "Инфракрасные");
        frequencyRanges.put(14, "Инфракрасные или видимые");
        frequencyRanges.put(17, "Рентгеновское излучение");
        frequencyRanges.put(20, "Гамма- излучение");

        Map<Integer, String> waveRanges = new HashMap<>();
        waveRanges.put(8, "Крайне и сверх низкие");
        waveRanges.put(4, "Низкие");
        waveRanges.put(3, "Длинные");
        waveRanges.put(2, "Средние");
        waveRanges.put(1, "Короткие");
        waveRanges.put(0, "Ультра короткие");
        waveRanges.put(-3, "Микроволны");
        waveRanges.put(-6, "Инфракрасные");
        waveRanges.put(-8, "Инфракрасные или видимые");
        waveRanges.put(-11, "Рентгеновское излучение");
        waveRanges.put(-14, "Гамма- излучение");

        Map<Integer, String> ranges = tableName.equalsIgnoreCase("длину волны") || tableName.equalsIgnoreCase("волна") ? waveRanges : frequencyRanges;

        for (Map.Entry<Integer, String> entry : ranges.entrySet()) {
            if (numberVariable >= entry.getKey()) {
                System.out.println("3 *10^" + numberVariable + " " + entry.getValue());
                break;
            }
        }
        if (!ranges.containsKey(numberVariable)) {
            System.out.println("Число вне известных диапазонов");
        }
    }
}

