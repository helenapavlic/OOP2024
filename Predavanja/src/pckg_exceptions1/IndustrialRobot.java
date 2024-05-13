package pckg_exceptions1;

public class IndustrialRobot extends Robot{
    protected IndustrialRobot(String name) {
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
        return "IndustrialRobot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
