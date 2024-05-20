package pckg_exceptions1;

public class MyException extends Exception {
//    mozemo kreirat vladtiti exception
//    nije dobro zato sto uglavno ne postoji razlog zasto ne bi koristili ugradeni exception
    private String msg;

    public MyException(String msg) {
        this.msg = msg;
    }

    public void provideMyExceptionInfo(){
        System.out.println(msg);
    }
}
