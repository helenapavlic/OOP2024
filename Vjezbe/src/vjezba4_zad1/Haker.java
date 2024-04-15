package vjezba4_zad1;

public class Haker {

    private Semafor semafor; //primjer za kompoziciju

    public Haker(){

    }

    public Haker(Semafor semafor){
        this.semafor = semafor;
    }

    public Semafor getSemafor() {
        return semafor;
    }

    public void setSemafor(Semafor semafor) {
        this.semafor = semafor;
    }

    public void changeSemaforCode(String codeNew){
        char[] chars = codeNew.toCharArray();
        semafor.setZeleno(String.valueOf(chars[0]));
        semafor.setZuto(String.valueOf(chars[1]));
        semafor.setCrveno(String.valueOf(chars[2]));

    }
}
