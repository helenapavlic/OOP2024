package zad_4_23_06_23_serijalizacija;

import java.io.Serial;
import java.io.Serializable;

public class Komitent implements Serializable {
    private static int cntId = 10;
    private int id;
    private String name;
    private Racun racun;

    public Komitent(String name) {
        this.name = name;
        id = cntId++;
        racun = null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Racun getRacun() {
        return racun;
    }

    public void kreirajRacun(){
        if (racun==null){
            racun = new Racun();
            System.out.println("kreiran racun");
        } else {
            System.out.println("klijent vec ima racun: " + racun);
        }
    }

//    public void uplataNaRac(float iznos){
//        racun.uplataNaRacun(iznos);
//    }
//
//    public void ispalta(float iznos){
//        racun.isplataSaRauna(iznos);
//    }

    @Override
    public String toString() {
        return "Komitent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", racun=" + racun +
                '}';
    }
}
