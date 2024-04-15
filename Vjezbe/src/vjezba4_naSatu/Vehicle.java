package vjezba4_naSatu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
    protected String brand;
    protected String model;
    protected Date dateProduced;

    private final int id;
    private static int cntId = 20;
    private static final String DatePattern = "dd.MM.yyyy.";


    public Vehicle() {
        this.id = cntId++;
    }

    public Vehicle(String brand) {
        this();
        this.brand = brand;

    }

    public Vehicle(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Vehicle(String brand, String model, String date) throws ParseException {
        this(brand, model);
        setDate(date);
    }

    public void info() {
//        dobit ćemo toString reprezentaciju
        System.out.println(this);
    }

    public void start() {
        System.out.println(getClass().getSimpleName() + " starting engine...");
    }

    public void stop() {
        System.out.println(getClass().getSimpleName() + " stopping engine...");
    }

    private void setDate(String dateAsText) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DatePattern);
        this.dateProduced = simpleDateFormat.parse(dateAsText);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", dateProduced=" + dateProduced +
                ", id=" + id +
                '}';
    }
}
