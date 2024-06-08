package zad_3_18_06_21;

public class Book {
    private static int cntId = 1;
    private int id;
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.id = cntId++;
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }

    public Author getAuthor() {
        return author;
    }
}
