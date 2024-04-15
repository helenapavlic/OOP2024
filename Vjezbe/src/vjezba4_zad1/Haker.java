package vjezba4_zad1;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Haker {

    Semafor smf;
    private String[] stNovo = new String[3];
    private int cnt;

    public Haker(Semafor semafor){
        this.smf = semafor;
        System.out.println("Preuzeo kontrolu nad: " + smf.toString());
    }


}
