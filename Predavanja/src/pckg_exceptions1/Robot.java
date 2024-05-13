package pckg_exceptions1;

public abstract class Robot {
    protected String name;
    protected int id;
    private static int cntId = 10;

    protected Robot(String name){
        this.name = name;
        this.id = cntId++;
    }

    public void turnOn(){
        System.out.println("turning on this robot");
    }

    public void TurnOff(){
        System.out.println("turning off this robot");
    }

    protected abstract void charge();
    protected abstract void changeState();
}
