package pckg_vecera_main_part;

import pckg_outsorce_vecera.Desert;
import pckg_outsorce_vecera.Predjelo;

public class Vecera {
    public static void main(String[] args) {
        Predjelo predjelo = new Predjelo("Cezar", "ssalata", 3);
        GlavnoJelo glavnoJelo = new GlavnoJelo();
        Desert desert = new Desert("Mouse", "kolač", 3);

//        //ne vide se atributi u Večera jer je bez modifikatora pristupa
//        predjelo.pojediPredjelo();
//        //vidljivi atributi iz večere jer je bez modifikatora pristupa
//        float cijena = glavnoJelo.totalPrice();
//        System.out.println(cijena);

        PredjeloNovo predjeloNovo = new PredjeloNovo("Grčka", "salata", 2, "main");
        predjeloNovo.pojediPredjelo();


    }
}
