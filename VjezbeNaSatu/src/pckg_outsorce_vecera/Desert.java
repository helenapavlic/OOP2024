package pckg_outsorce_vecera;

public class Desert {
    String naziv;
    String vrsta;
    int kolicina;

    public Desert(String naziv, String vrsta, int kolicina) {
        this.naziv = naziv;
        this.vrsta = vrsta;
        this.kolicina = kolicina;
    }

    void infoDesert() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Desert{" +
                "naziv='" + naziv + '\'' +
                ", vrsta='" + vrsta + '\'' +
                ", kolicina=" + kolicina +
                '}';
    }
}
