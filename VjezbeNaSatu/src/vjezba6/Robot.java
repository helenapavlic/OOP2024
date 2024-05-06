package vjezba6;

public class Robot {
    private static int cntId = 100;
    private int id;
    private String description;

    public Robot(String description) {
        this.id = cntId++;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
