package zad_4_23_06_23_serijalizacija;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Racun implements Serializable {
    private static int idTransakcije = 0;
    private float stanjeNaRacunu;
    private int brojRacuna;
    private ArrayList<String> transakcije = new ArrayList<>();
//    private float iznosUplate;
//    private float iznosIsplate;

    protected Racun() {
        brojRacuna = randBrojRac();
        stanjeNaRacunu = 1000.0F;
        transakcije.add("Otvaranje racuna sa stanjem: " + stanjeNaRacunu);
        System.out.println();
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    private static int randBrojRac() {
        return ThreadLocalRandom.current().nextInt(1000, 10000);
    }

    public ArrayList<String> getTransakcije() {
        return transakcije;
    }

    public void uplataNaRacun(float iznos) {
        System.out.println("stanje na rac prije uplate: " + stanjeNaRacunu);
        idTransakcije++;
        stanjeNaRacunu += iznos;
        System.out.println("stanje nakon uplate: " + stanjeNaRacunu);
        transakcije.add("id: "+ idTransakcije + " | uplata: " + iznos + " | stanje na racunu: " + stanjeNaRacunu);
        System.out.println();

    }

    public void isplataSaRauna(float iznos) {
        System.out.println("trenutno stanje na racunu: " + stanjeNaRacunu);
        if (iznos <= stanjeNaRacunu) {
            idTransakcije++;
            stanjeNaRacunu -= iznos;
            System.out.println("uspješna isplata");
            System.out.println("novo stanje na racunu: " + stanjeNaRacunu);
            transakcije.add("id: "+ idTransakcije + " | isplata: " + iznos + " | stanje na racunu: " + stanjeNaRacunu);
            System.out.println();
        } else {
            idTransakcije++;
            transakcije.add("id: "+ idTransakcije + " | neuspjela isplata iznosa: " + iznos + " | stanje na racunu: " + stanjeNaRacunu);
            System.out.println("stanje na racunu je manje od trazenog iznosa");
            System.out.println("isplata nije uspjela");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Racun{" +
                "stanjeNaRacunu=" + stanjeNaRacunu +
                ", brojRacuna=" + brojRacuna +
                ", transakcije=" + transakcije +
                '}';
    }
}
