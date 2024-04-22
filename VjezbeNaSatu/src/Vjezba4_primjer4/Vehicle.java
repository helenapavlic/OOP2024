package Vjezba4_primjer4;

public class Vehicle {
    private static int cntId = 100;
    private final String brand;
    private final int id;
    private String registrationPlate;

    public Vehicle(String brand) {
        this.brand = brand;
        this.id = cntId++;
        generateRegistrationPlate();

    }

    private String generateRegistrationPlate() {
        return getClass().getSimpleName() + "@" + id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", registrationPlate='" + registrationPlate + '\'' +
                ", id=" + id +
                '}';
    }

}
