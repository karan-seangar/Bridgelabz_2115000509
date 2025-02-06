import java.util.ArrayList;
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library library1 = new Library();
        Library library2 = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        System.out.println("Library 1 Books:");
        library1.displayBooks();
        
        System.out.println("\nLibrary 2 Books:");
        library2.displayBooks();
    }
}
