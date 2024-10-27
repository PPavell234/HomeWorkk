package labs.Practice4Part2;

import java.util.Scanner;

public class Task7 {

    /**
     * Массив исключений для городов, которые требуют артикля "le".
     */
    public static final String[] CITIES_OF_EXCEPTION = {
            "Bellize",
            "Cambodge",
            "Mexique",
            "Mozambique",
            "Zaïre",
            "Zimbabwe"
    };

    /**
     * Массив стран, названия которых находятся во множественном числе и
     * требуют артикля "les".
     */

    public static final String[] COUNTRIES_IN_THE_PLURAL = {
            "Etats-Unis",
            "Pays-Bas"
    };


    /**
     * Определяет правильный артикль перед названием города или страны.
     *
     * @param nameOfTheCity Название города или страны для определения артикля.
     * @return Строка с правильным артиклем ("le", "la", "les" или "l'")
     * перед названием.
     */

    public String ArticleOfTheCountries(String nameOfTheCity) {
        String lastChar = String.valueOf(nameOfTheCity.charAt(nameOfTheCity.length() - 1));
        char firstLetter = nameOfTheCity.toLowerCase().charAt(0); // Извлекаем первую букву в нижнем регистре

        // Проверяем условия
        if (isCountryInThePlural(nameOfTheCity)) {
            return "les " + capitalize(nameOfTheCity);
        } else if (lastChar.equals("e") || isCityOfException(nameOfTheCity.toLowerCase())) {
            if (isCityOfException(nameOfTheCity)) {
                return "le " + capitalize(nameOfTheCity);
            } else {
                return "la " + capitalize(nameOfTheCity);
            }
        } else if ("aeiouy".indexOf(firstLetter) != -1) {
            return "l'" + capitalize(nameOfTheCity);
        }
        return "Error";
    }

    /**
     * Проверяет, является ли название города исключением.
     *
     * @param nameCity Название города для проверки.
     * @return true, если название города является исключением; иначе false.
     */
    private static boolean isCityOfException(String nameCity) {
        nameCity = nameCity.toLowerCase();
        for (String exceptionCity : CITIES_OF_EXCEPTION) {
            if (exceptionCity.toLowerCase().equals(nameCity)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Проверяет, является ли название страны множественным числом.
     *
     * @param nameCity Название страны для проверки.
     * @return true, если название страны находится в множественном числе; иначе false.
     */
    public static boolean isCountryInThePlural(String nameCity) {
        nameCity = nameCity.trim(); // Удаляем лишние пробелы
        for (String pluralCountry : COUNTRIES_IN_THE_PLURAL) {
            // Сравниваем с учетом регистра
            if (pluralCountry.equals(nameCity)) {
                return true; // Если совпадает, возвращаем true
            }
        }
        return false; // Если не нашли совпадений, возвращаем false
    }


    /**
     * Преобразует первую букву строки в верхний регистр.
     *
     * @param str Строка, которую нужно преобразовать.
     * @return Строка с первой буквой в верхнем регистре.
     */
    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        String nameCity1 = task7.ArticleOfTheCountries("Belgique");
        String nameCity2 = task7.ArticleOfTheCountries("Afghanistan");
        String nameCity3 = task7.ArticleOfTheCountries("Etats-Unis");
        String nameCity4 = task7.ArticleOfTheCountries("Pays-Bas");
        String nameCity5 = task7.ArticleOfTheCountries("Zaïre");
        System.out.println(nameCity1);
        System.out.println(nameCity3);
        System.out.println(nameCity4);
        System.out.println(nameCity5);
    }
}