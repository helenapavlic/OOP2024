package pckg_exceptions1;

public class StarWarsRobot extends Robot {
    public StarWarsRobot(String name) {
        super(name);
    }

    @Override
    protected void charge() {

    }

    @Override
    protected void changeState() {

    }

    @Override
    public String toString() {
        return "StarWarsRobot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
