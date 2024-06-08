package Zad2_18_06_21;

public class Boat extends Vehicle{
    private String boatName;

    public Boat(String boatName) {
        this.id = cnt++;
        this.boatName = boatName;
    }

    @Override
    public void runEngine() {
        System.out.println("Run engine for: " + getClass().getSimpleName());
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine for: " + getClass().getSimpleName());

    }

    @Override
    public void getEnergy() {
        System.out.println("In the case of an electric boat ensure battery power, otherwise, get the fuel!");
    }

    @Override
    public void description() {
        System.out.println(this);
    }

    @Override
    public void move(String direction, double speed) {
        System.out.println(getClass().getSimpleName() + " is moving:");
        System.out.println("direction: " + direction);
        System.out.println("speed: " + speed);
    }

    @Override
    public String toString() {
        return "Boat{" +
                "boatName='" + boatName + '\'' +
                ", id=" + id +
                '}';
    }
}
