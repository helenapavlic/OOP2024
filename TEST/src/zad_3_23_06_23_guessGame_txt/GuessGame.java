package zad_3_23_06_23_guessGame_txt;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class GuessGame {
    private String[] city_arr = {"Madrid", "Barcelona", "Bogota", "Bakar", "Medina", "Macau", "Benkovac", "Baltimore", "Baku", "Caracas", "Cairo", "Chicago", "Delhi", "Dhaka", "Damaskus", "Drniš", "Giza", "Gospić", "Hamburg", "Harare", "Havana", "Istanbul", "Izmir", "Biograd na moru", "Crikvenica", "Jakarta", "Karachi", "Karlovac", "Dubrovnik", "Hvar", "Honk Kong", "Houston", "Kazan", "Kobe", "Jastrebarsko", "Kaštela", "Solin", "Split", "Vukovar", "Zadar", "Lagos", "London", "Mecca", "Milan", "Makarska", "Medina", "Montreal", "Šibenik", "Napoli", "New York", "Osijek", "Osaka", "Paris", "Perth", "Rome", "Rio de Janeiro", "Novigrad", "Opatija", "Pazin", "Pakrac", "San Diego", "Santa Cruz", "Sao Paulo", "Seoul", "Stockholm", "Tokyo", "Pula", "Senj", "Sinj", "Valencia", "Vienna", "Samobor", "Vinkovci", "Zabok"};

    private String cityToGuess;

    public GuessGame(){

    }

    public String randomPickCity() {
        int citiesInList = city_arr.length;
        int randNum = ThreadLocalRandom.current().nextInt(citiesInList);
        String city = city_arr[randNum];
        cityToGuess = city;
        return city;
    }


    public void printToGuess(String country) {
        int numOfLetters = country.length();
        char firstLetter = country.charAt(0);

        System.out.println("Ime grada iam ukupno: " + numOfLetters + " znakova / slova uključivo s razmaknicama...");
        System.out.println("Prvo slovo je: " + firstLetter);
    }

    public boolean checkGuess(String guess) {
        return guess.strip().equalsIgnoreCase(cityToGuess);
    }
}
