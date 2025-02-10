abstract class Product{
    private int productId;
    private String name;
    private double price;

    public Product(String name, int productId, double price){
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getProductId(){
        return productId;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public double getPrice(){
        return price;
    }

    public void setprice(double price){
        this.price = price;
    }

    abstract double calculateDiscount();

    public void displayDetails(){
        System.out.println("Product Name : " + name);
        System.out.println("Product Id : " + productId);
        System.out.println("Product Price : " + price);
    }
}

interface Taxable{

    double calculateTax();

    void getTaxDetails();
}

class Electronics extends Product implements Taxable{
    private double discount;

    public Electronics(String name, int productId, double price, double discount){
        super(name, productId, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount(){
        return (getPrice() * discount) / 100;
    }

    @Override
    public double calculateTax(){
        return (getPrice() * 18) / 100;
    }

    @Override
    public void getTaxDetails(){
        System.out.println("Tax on Product " + getName() + " is : " + calculateTax());
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        double finalPrice = getPrice() + calculateTax() - calculateDiscount();
        System.out.println("Discounted Price : " + calculateDiscount());
        System.out.println("Tax on Product : " + calculateTax());
        System.out.println("Product Price after including taxes and discount : " + finalPrice);
        System.out.println();
    }
}

class Clothing extends Product implements Taxable{
    private double discount;

    public Clothing(String name, int productId, double price, double discount){
        super(name, productId, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount(){
        return (getPrice() * discount) / 100;
    }

    @Override
    public double calculateTax(){
        return (getPrice() * 18) / 100;
    }

    @Override
    public void getTaxDetails(){
        super.displayDetails();
        System.out.println("Tax on Product " + getName() + " is : " + calculateTax());
    }

     @Override
    public void displayDetails(){
        super.displayDetails();
        double finalPrice = getPrice() + calculateTax() - calculateDiscount();
        System.out.println("Discounted Price : " + calculateDiscount());
        System.out.println("Tax on Product : " + calculateTax());
        System.out.println("Product Price after including taxes and discount : " + finalPrice);
        System.out.println();
    }
}

class Groceries extends Product implements Taxable{
    private double discount;

    public Groceries(String name, int productId, double price, double discount){
        super(name, productId, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount(){
        return (getPrice() * discount) / 100;
    }

    @Override
    public double calculateTax(){
        return (getPrice() * 18) / 100;
    }

    @Override
    public void getTaxDetails(){
        super.displayDetails();
        System.out.println("Tax on Product " + getName() + " is : " + calculateTax());
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        double finalPrice = getPrice() + calculateTax() - calculateDiscount();
        System.out.println("Discounted Price : " + calculateDiscount());
        System.out.println("Tax on Product : " + calculateTax());
        System.out.println("Product Price after including taxes and discount : " + finalPrice);
        System.out.println();
    }
}

public class EcommercePlatform{
    public static void main(String []args){
        Product e = new Electronics("Laptop", 101, 45000, 10);
        Product c = new Clothing("Shirt", 102, 1500, 5);
        Product g = new Groceries("Rice", 103, 50, 2);

        e.displayDetails();
        c.displayDetails();
        g.displayDetails();
    }
}
