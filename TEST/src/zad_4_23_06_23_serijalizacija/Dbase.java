package zad_4_23_06_23_serijalizacija;

import java.io.*;
import java.util.ArrayList;

public class Dbase {
    ArrayList<Komitent> komitenti;
    private String filePath = "TEST/src/zad_4_23_06_23_serijalizacija/podaci.bin";

    public Dbase(){
        this.komitenti = new ArrayList<>();
    }
    public void dodajKomitentaUBazu(Komitent komitent){
        komitenti.add(komitent);
        save();
    }

    public void save() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(komitenti);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void load() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            komitenti = (ArrayList<Komitent>)in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printAllTransakcije() {
        for (Komitent komitent : komitenti) {
            System.out.println("Komitent: " + komitent.getName());
            Racun racun = komitent.getRacun();
            if (racun != null) {
                System.out.println("Račun: " + racun.getBrojRacuna());
                for (String transakcija : racun.getTransakcije()) {
                    System.out.println(transakcija);
                }
            }
            System.out.println();
        }
    }


}
