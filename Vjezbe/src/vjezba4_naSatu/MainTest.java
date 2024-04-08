package vjezba4_naSatu;

import java.text.ParseException;

public class MainTest {
    public static void main(String[] args) {
        Vehicle vehicle = null;
        try {
            vehicle = new Vehicle("BMW", "M5", "14.03.2020.");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        vehicle.info();
    }
}
