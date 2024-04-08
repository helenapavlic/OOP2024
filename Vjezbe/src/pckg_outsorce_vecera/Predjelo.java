package pckg_outsorce_vecera;

public class Predjelo {

     String naziv;
     String vrsta;
     int kolicina;

    public Predjelo(String naziv, String vrsta, int kolicina){
        this.naziv = naziv;
        this.vrsta = vrsta;
        this.kolicina = kolicina;
    }

    public void pojediPredjelo(){
        System.out.println("pojedeno: " + getClass().getName() + " | naziv: " + naziv +  " | kol: " + kolicina );
    }

    int KojaKolicina(){
        return kolicina;
    }
}
