package pckg_vecera_main_part;

import pckg_outsorce_vecera.Predjelo;

public class PredjeloNovo extends Predjelo {
    private String proizvodjac;

    public PredjeloNovo(String naziv, String vrsta, int kolicina, String proizvodjac) {
        super(naziv, vrsta, kolicina);
        this.proizvodjac = proizvodjac;
    }


    @Override
    public String toString() {
        return "PredjeloNovo{" +
                "proizvodjac='" + proizvodjac + '\'' +
                ", naziv='" + naziv + '\'' +
                ", vrsta='" + vrsta + '\'' +
                ", kolicina=" + kolicina +
                '}';
    }
}
