package vjezba4_zad1;

import java.rmi.server.ServerNotActiveException;

public class TestSemafor {
    public static void main(String[] args) {
        Semafor semafor = new Semafor("1","0","0"); // zeleno
        System.out.println(semafor);

        semafor.giveSemaforStatus("001");
        semafor.giveSemaforStatus("100");
        semafor.giveSemaforStatus("6492");
    }
}
