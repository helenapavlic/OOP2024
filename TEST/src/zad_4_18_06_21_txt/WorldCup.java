package zad_4_18_06_21_txt;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WorldCup {
    private Scanner sc;
    private ArrayList<String> part;
    private Country country;
    private String year;

    public WorldCup(){
        sc = new Scanner(System.in);

    }

    public void worldCupInYear(int numPart){
        System.out.print("Unesite godinu: ");
        year = sc.nextLine();
        System.out.println("Participants in the WorldCup - " + year );

        country = new Country();
        part= country.getParticipants(numPart);

        //list participants
        listParticipants();
        System.out.println();
    }

    public void listParticipants(){
        for (String country: part) {
            System.out.println(country);
        }
    }

//    spremanje u txt datoteku
    public void save2File(String source){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(source, true))) {
            writer.write("-------------------------------");
            writer.newLine();
            writer.write("Participants in the WorldCup: " + year);
            writer.newLine();
            for (String participant : part) {
                writer.write(participant);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("error");
        }


    }

//    citanje iz txt datoteke
    public void read4File(String source){
        System.out.println("-----------------------");
        System.out.println("from file: " + source);

        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("error 2");
        }
    }

}
