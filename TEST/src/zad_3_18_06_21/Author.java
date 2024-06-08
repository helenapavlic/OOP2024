package zad_3_18_06_21;

public class Author {
    private static int cntId = 10;
    private int id;
    private String name;


    public Author(String name) {
        this.id = cntId++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
