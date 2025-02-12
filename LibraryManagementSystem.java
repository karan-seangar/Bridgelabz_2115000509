class Library {
    private BookNode head;
    private BookNode tail;
    private int size;

    class BookNode {
        String title;
        String author;
        String genre;
        int bookId;
        boolean isAvailable;
        BookNode next;
        BookNode prev;

        public BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.isAvailable = isAvailable;
            this.next = null;
            this.prev = null;
        }
    }

    
    public void addBookAtFirst(int bookId, String title, String author, String genre, boolean isAvailable) {
        BookNode newBook = new BookNode(bookId, title, author, genre, isAvailable);
        if (head == null) {
            head = newBook;
            tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        size++;
        System.out.println("Book added at the beginning: " + title);
    }

    
    public void addBookAtLast(int bookId, String title, String author, String genre, boolean isAvailable) {
        BookNode newBook = new BookNode(bookId, title, author, genre, isAvailable);
        if (head == null) {
            head = newBook;
            tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        size++;
        System.out.println("Book added at the end: " + title);
    }

    
    public void deleteBook(int bookId) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                if (current == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }
                else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } 
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                System.out.println("Book deleted: " + current.title);
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    
    public void updateAvailability(int bookId, boolean isAvailable) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = isAvailable;
                System.out.println("Availability updated for book: " + current.title + " to " + (isAvailable ? "Available" : "Not Available"));
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    
    public void searchBook(String author, String genre) {
        BookNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.author.equalsIgnoreCase(author) || current.genre.equalsIgnoreCase(genre)) {
                System.out.println("Book Found:");
                System.out.println("Title: " + current.title);
                System.out.println("Author: " + current.author);
                System.out.println("Genre: " + current.genre);
                System.out.println("Availability: " + (current.isAvailable ? "Available" : "Not Available"));
                System.out.println();
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No books found by author: " + author + " or genre: " + genre);
        }
    }

    
    public void displayBooksInForward() {
        BookNode current = head;
        if (current == null) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Displaying books in forward order:");
        while (current != null) {
            System.out.println("Book ID: " + current.bookId);
            System.out.println("Title: " + current.title);
            System.out.println("Author: " + current.author);
            System.out.println("Genre: " + current.genre);
            System.out.println("Availability: " + (current.isAvailable ? "Available" : "Not Available"));
            System.out.println();
            current = current.next;
        }
    }

    
    public void displayBooksInBackward() {
        BookNode current = tail;
        if (current == null) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Displaying books in backward order:");
        while (current != null) {
            System.out.println("Book ID: " + current.bookId);
            System.out.println("Title: " + current.title);
            System.out.println("Author: " + current.author);
            System.out.println("Genre: " + current.genre);
            System.out.println("Availability: " + (current.isAvailable ? "Available" : "Not Available"));
            System.out.println();
            current = current.prev;
        }
    }

    
    public void countBooks() {
        System.out.println("Total books in library: " + size);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBookAtFirst(1, "Wings of Fire", "A.P.J. Abdul Kalam", "Autobiography", true);
        library.addBookAtLast(2, "The White Tiger", "Aravind Adiga", "Fiction", true);
        library.addBookAtLast(3, "India After Gandhi", "Ramachandra Guha", "History", false);
        library.addBookAtFirst(4, "The God of Small Things", "Arundhati Roy", "Literature", true);

        library.displayBooksInForward();
        library.displayBooksInBackward();
        library.updateAvailability(2, false);
        library.searchBook("Arundhati Roy", "Fiction");
        library.countBooks();
        library.deleteBook(3);
        library.displayBooksInForward();
    }
}
