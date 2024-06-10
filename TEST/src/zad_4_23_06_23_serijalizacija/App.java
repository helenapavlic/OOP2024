package zad_4_23_06_23_serijalizacija;

public class App {
    public static void main(String[] args) {
        Dbase dataBase = new Dbase();

        Komitent komitent = new Komitent("komitent 1");
        System.out.println(komitent);

        Komitent komitent2 = new Komitent("komitent 2");

        komitent.kreirajRacun();
        komitent.kreirajRacun();
        komitent2.kreirajRacun();
        System.out.println(komitent);

        if (komitent.getRacun() != null){
            komitent.getRacun().uplataNaRacun(100);
            komitent.getRacun().isplataSaRauna(20);
            komitent.getRacun().isplataSaRauna(460);
            komitent.getRacun().isplataSaRauna(460000);
            komitent.getRacun().isplataSaRauna(30);
        }

        if (komitent2.getRacun()!= null){
            komitent2.getRacun().isplataSaRauna(500);
            komitent2.getRacun().isplataSaRauna(500);
            komitent2.getRacun().isplataSaRauna(80000);
            komitent2.getRacun().uplataNaRacun(8);
        }

        dataBase.dodajKomitentaUBazu(komitent);
        dataBase.dodajKomitentaUBazu(komitent2);

        dataBase.save();
        System.out.println("------------------------");
        dataBase.printAllTransakcije();




    }
}
