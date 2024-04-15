package vjezba4_zad1;

import java.util.IllegalFormatCodePointException;

public class Semafor {
    //unaprijediti klasu, provjera unosa da je String

    private String crveno;
    private String zuto;
    private String zeleno;
    private String code;
    private static final String[] CODES = {"100", "010", "001"};

    public Semafor(){
        this.crveno = "1";
        this.zuto = "0";
        this.zeleno = "0";
        this.code = this.zeleno + this.zuto + this.crveno;
    }

    public Semafor(String zeleno, String zuto, String crveno){
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

    private boolean checkCode(String code){
        for (int i = 0; i < CODES.length; i++) {
            if (code.equals(CODES[i])){
                return true;
            }
        }
        return false;
    }

    public void giveSemaforStatus(String code){
        if (checkCode(code)){
            if (code.equals(CODES[0])){
                System.out.println("zeleno svjetlo -> prolaz");
            } else if (code.equals(CODES[1])) {
                System.out.println("zuto svjetlo -> oprez");
            } else if (code.equals(CODES[2])){
                System.out.println("crveno svjetlo -> stani");
            }
        } else {
            System.out.println("neispravno stanje -> treptece zuto");
            setZeleno("0");
            setZuto("1");
            setCrveno("0");
        }
    }

    public void putSemaforInWork(){
        int cnt = 0;
        while (cnt < 10){
            //giveSemaforStatus();
            cnt++;
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
}
