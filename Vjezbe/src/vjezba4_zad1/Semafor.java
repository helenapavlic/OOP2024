package vjezba4_zad1;

import java.util.IllegalFormatCodePointException;

public class Semafor {
    //unaprijediti klasu, provjera unosa da je String

    private String crveno;
    private String zuto;
    private String zeleno;
    private String code;
    private static final String[] CODES = {"100", "010", "001"};

    public Semafor() {
        this.crveno = "1";
        this.zuto = "0";
        this.zeleno = "0";
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    public Semafor(String zeleno, String zuto, String crveno) {
        this.zeleno = zeleno;
        this.zuto = zuto;
        this.crveno = crveno;
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    public String getCrveno() {
        return crveno;
    }

    public void setCrveno(String crveno) {
        this.crveno = crveno;
    }

    public String getZuto() {
        return zuto;
    }

    public void setZuto(String zuto) {
        this.zuto = zuto;
    }

    public String getZeleno() {
        return zeleno;
    }

    public void setZeleno(String zeleno) {
        this.zeleno = zeleno;
    }

    private boolean checkCode() {
        for (String elCode : CODES) {
            if (code.equals(elCode)) {
                return true;
            }
        }
        return false;
    }


    public void giveSemaforStatus() {
        if (checkCode()) {
            switch (code) {
                case "100":
                    System.out.println("prolaz");
                    break;
                case "010":
                    System.out.println("oprez");
                    break;

                case "001":

                    System.out.println("stoj");
                    break;

                default:
                    System.out.println("greska koja nikad nece biti..");
            }

        } else {
            System.out.println("Pogrešan kod semafora - koristite novi kod!");
        }
    }

    @Override
    public String toString() {
        return "Semafor{" +
                "crveno='" + crveno + '\'' +
                ", zuto='" + zuto + '\'' +
                ", zeleno='" + zeleno + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public void putSemaforInWork() {
        int cnt = 0;
        while (cnt < 10) {
            giveSemaforStatus();
            int idx = (cnt + 1) % 3;
            System.out.println(idx);
            this.code = CODES[idx];
            cnt++;
        }
    }
}
