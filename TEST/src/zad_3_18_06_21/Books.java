package zad_3_18_06_21;

import java.util.ArrayList;

public class Books {
    private ArrayList<Book> books;

    public Books() {
        books = new ArrayList<>();
    }

    public void addNewBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println("book is already added");
        }
    }

    public void listAllBooks() {
        if (!books.isEmpty()) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else {
            System.out.println("no books yet");
        }

    }
}
