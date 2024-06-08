package zad_2_18_06_21;

public abstract class Vehicle {

    protected int id;
    protected static int cnt = 0;

    public abstract void runEngine();

    public abstract void stopEngine();

    public abstract void getEnergy();

    public abstract void description();

    public abstract void move(String direction, double speed);

    @Override
    public String toString() {
        return "Vehicle {" +
                "id=" + id +
                '}';
    }
}
