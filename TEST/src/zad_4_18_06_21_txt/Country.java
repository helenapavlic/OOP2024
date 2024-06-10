package zad_4_18_06_21_txt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Country {

    private static String[] cntr = { "France", "Spain", "USA", "Croatia", "Deutschland", "Belgium", "Sweeden", "Canada", "Great Britain", "Russia", "Kongo", "Mexico", "Brasil", "Turkey", "S. Korea", "N. Korea", "Japan", "BiH", "Slovenia", "Chile", "Maroco", "New Zealand", "Australia", "Island", "Argentina", "Tunis" };

    public ArrayList<String> getParticipants(int numberOfParticipants){
        ArrayList<String> participans = new ArrayList<>();
        int maxNum = cntr.length;
        Random random = new Random();
        int numAdded = 0;

        if (numberOfParticipants > maxNum){
            System.out.println("Nema toliko država u listi, maksimalni broj država je: " + maxNum);
            System.out.println("Sve države su sudionici!");
            participans.addAll(Arrays.asList(cntr));
            System.out.println(participans);
            return participans;
        }

        while (numAdded < numberOfParticipants){
            int rand = random.nextInt(maxNum);
            if (!participans.contains(cntr[rand])){
                participans.add(cntr[rand]);
                numAdded++;
            }
        }
        System.out.println(participans);
        return participans;
        }
}
