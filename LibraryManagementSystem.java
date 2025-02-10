abstract class LibraryItem{
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author){
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId(){
        return itemId;
    }

    public void setItemId(int itemId){
        this.itemId = itemId;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    abstract void getLoanDuration();

    public void getItemDetails(){
        System.out.println("Item Id : " + itemId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}

interface Reservable{
    void reserveItem();
    void checkAvailability();
}

class Book extends LibraryItem implements Reservable{
    private boolean isAvailable;

    public Book(int itemId, String title, String author){
        super(itemId, title, author);
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    void getLoanDuration(){
        System.out.println("Loan duration for a book is 14 days");
    }

    @Override
    public void reserveItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Book reserved successfully");
        } else {
            System.out.println("Book is already reserved");
        }
    }

    @Override
    public void checkAvailability() {
        System.out.println("Book is " + (isAvailable() ? "available" : "not available"));
    }

    @Override
    public void getItemDetails(){
        System.out.println("Book Details : ");
        super.getItemDetails();
        getLoanDuration();
    }
}

class Magazine extends LibraryItem implements Reservable{
    private boolean isAvailable;

    public Magazine(int itemId, String title, String author){
        super(itemId, title, author);
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    void getLoanDuration(){
        System.out.println("Loan duration for a magazine is 7 days");
    }

    @Override
    public void reserveItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Magazine reserved successfully");
        } else {
            System.out.println("Magazine is already reserved");
        }
    }

    @Override
    public void checkAvailability() {
        System.out.println("Magazine is " + (isAvailable() ? "available" : "not available"));
    }

    @Override
    public void getItemDetails(){
        System.out.println("Magazine Details : ");
        super.getItemDetails();
        getLoanDuration();
    }
}

class DVD extends LibraryItem implements Reservable{
    private boolean isAvailable;

    public DVD(int itemId, String title, String author){
        super(itemId, title, author);
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    void getLoanDuration(){
        System.out.println("Loan duration for a DVD is 2 days");
    }

    @Override
    public void reserveItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("DVD reserved successfully");
        } else {
            System.out.println("DVD is already reserved");
        }
    }

    @Override
    public void checkAvailability() {
        System.out.println("DVD is " + (isAvailable() ? "available" : "not available"));
    }

    @Override
    public void getItemDetails(){
        System.out.println("DVD Details : ");
        super.getItemDetails();
        getLoanDuration();
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        
        Book book1 = new Book(101, "Wings of Fire", "Dr. A.P.J. Abdul Kalam");
        Magazine magazine1 = new Magazine(201, "India Today", "Aroon Purie");
        DVD dvd1 = new DVD(301, "3 Idiots", "Rajkumar Hirani");

        
        book1.getItemDetails();
        book1.checkAvailability();
        System.out.println();

        
        magazine1.getItemDetails();
        magazine1.checkAvailability();
        System.out.println();

        
        dvd1.getItemDetails();
        dvd1.checkAvailability();
    }
}
