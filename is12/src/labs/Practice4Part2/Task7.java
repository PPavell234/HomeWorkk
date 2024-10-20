package labs.Practice4Part2;

import java.util.Scanner;

public class Task7 {
    private String nameСity;

    public static final String[] CITIES_OF_EXCEPTION = {
            "Bellize",
            "Cambodge",
            "Mexique",
            "Mozambique",
            "Zaïre",
            "Zimbabwe"
    };

    public static final String[] COUNTRIES_IN_THE_PLURAL = {
            "Etats-Unis",
            "Pays-Bas",
            "The Netherlands" //Другое искл
    };


    public String ArticleOfTheCountries(String nameOfTheСity) {
        String lastChar = String.valueOf(nameOfTheСity.charAt(nameOfTheСity.length() - 1));
        String nameToLower = nameOfTheСity.toLowerCase(); // Преобразуем в нижний регистр
        char firstLetter = nameToLower.charAt(0); // Извлекаем первую букву после преобразования

        //a, e, i, o, u, y.
        if (lastChar.equals("e") || isCityOfException(nameToLower)) {
            return "la " + nameOfTheСity.substring(0, 1).toUpperCase() + nameOfTheСity.substring(1);
        } else if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u' || firstLetter == 'y') {
            return "l'" + nameOfTheСity.substring(0, 1).toUpperCase() + nameOfTheСity.substring(1);
        } else if (isCountryInThePlural(nameToLower)) {
            return "les " + nameOfTheСity.substring(0, 1).toUpperCase() + nameOfTheСity.substring(1);
        } else {
            return "le " + nameOfTheСity.substring(0, 1).toUpperCase() + nameOfTheСity.substring(1);
        }
    }

    private static boolean isCityOfException(String nameСity) {
        nameСity = nameСity.toLowerCase();
        for (String exceptionCity : CITIES_OF_EXCEPTION) {
            if (exceptionCity.toLowerCase().equals(nameСity)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCountryInThePlural(String nameCity) {
        nameCity = nameCity.toLowerCase();
        for (String pluralCountry : COUNTRIES_IN_THE_PLURAL) {
            if (pluralCountry.toLowerCase().equals(nameCity)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        String nameCite = task7.ArticleOfTheCountries("Afghanistan");
        System.out.println(nameCite);


    }
}
