// Abstract category class
abstract class ProductCategory {
    private String categoryName;

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}

// Specific categories
class BookCategory extends ProductCategory {
    public BookCategory() {
        super("Books");
    }
}

class ClothingCategory extends ProductCategory {
    public ClothingCategory() {
        super("Clothing");
    }
}

// Generic Product class
class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }

    public void displayDetails() {
        System.out.println("Product: " + name + " | Category: " + category.getCategoryName() + " | Price: $" + price);
    }
}

// Main class
public class Marketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 50, new BookCategory());
        book.applyDiscount(10);
        book.displayDetails();
    }
}
