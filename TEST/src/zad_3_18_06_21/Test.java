package zad_3_18_06_21;

public class Test {
    public static void main(String[] args) {

        Author author1 = new Author("author1");
        Author author2 = new Author("author2");
        Author author3 = new Author("author3");

        Book book1 = new Book("book1",author1);
        Book book2 = new Book("book2",author1);
        Book book3 = new Book("book3",author1);

        Book book4 = new Book("book4",author2);
        Book book5 = new Book("book5",author2);
        Book book6 = new Book("book6",author2);

        Book book7 = new Book("book7",author3);
        Book book8 = new Book("book8",author3);
        Book book9 = new Book("book9",author3);

        Books books = new Books();
        books.addNewBook(book1);
        books.addNewBook(book2);
        books.addNewBook(book3);
        books.addNewBook(book4);
        books.addNewBook(book5);
        books.addNewBook(book6);
        books.addNewBook(book7);
        books.addNewBook(book8);
        books.addNewBook(book9);
        books.addNewBook(book9);

        books.listAllBooks();


    }



}
