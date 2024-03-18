package pckg_this;

public class Hlace {
    private String manuf;
    private String model;
    private boolean isClear;


    public Hlace(String manuf, String model){
        this.manuf = manuf;
        this.model = model;
        this.isClear=true;

    }

    public Hlace polovne(){
        this.isClear = false;
//        vraća stenutni primjerak trenutne klase
        return this;
    }

    public boolean isClear() {
        return isClear;
    }

    public void setStatusClear(){
//        mijenja status cistoce
        if (!isClear){
            isClear  = true;
        } else {
            isClear = false;
        }
    }

    public void setClear() {
        this.isClear = true;
    }

    public Hlace operiMe(Student student){
        System.out.println("Hlače su na neki način čiste...");
//        prosljeđujemo trenutni objekt lija metoda se poziva
        return student.operiHlace(this);
    }

    @Override
    public String toString() {
        return "Hlace{" +
                "manuf='" + manuf + '\'' +
                ", model='" + model + '\'' +
                ", isClear=" + isClear +
                '}';
    }


}
