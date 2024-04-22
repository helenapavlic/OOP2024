package vjezba4_zad1;

import java.rmi.server.ServerNotActiveException;

public class TestSemafor {

    public static void main(String[] args) {
        Semafor semafor = new Semafor("0", "0", "1");
        Haker hacker = new Haker(semafor);
        System.out.println(semafor);
        semafor.giveSemaforStatus();
        semafor.putSemaforInWork();
        System.out.println(semafor);
        hacker.changeSemaforCode("010");
        semafor.putSemaforInWork();

    }
}
