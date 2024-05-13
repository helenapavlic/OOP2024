package pckg_exceptions1;

public class FlyingRobot extends Robot {
    protected FlyingRobot(String name) {
        super(name);
    }

    @Override
    protected void charge() {
        System.out.println("Changing robot");

    }

    @Override
    protected void changeState() {
        System.out.println("change state: " + getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "FlyingRobot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
