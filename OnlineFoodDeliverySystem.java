import java.util.List;
import java.util.ArrayList;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
 
    public abstract double calculateTotalPrice();

    public void getItemDetails(){
        System.out.println("Food Item Name : " + itemName);
        System.out.println("Food Item Quantity : " + quantity);
        System.out.println("Food Item Price : " + price);
    }
}

interface Discountable {
    double applyDiscount(double discountPercentage);
    void getDiscountDetails();
}



class VegItem extends FoodItem implements Discountable {
    private double discountPercentage;

    public VegItem(String itemName, double price, int quantity, double discountPercentage) {
        super(itemName, price, quantity);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = getPrice() * getQuantity();
        return basePrice + (basePrice * 12 / 100); 
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        double discountAmount = calculateTotalPrice() * (discountPercentage / 100);
        return discountAmount;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount on Veg Items : " + applyDiscount(discountPercentage));
    }

    @Override
    public void getItemDetails(){
        super.getItemDetails();
        double finalPrice = calculateTotalPrice() - applyDiscount(discountPercentage);
        System.out.println("Veg Food Item Price incuding taxes and discount : " + finalPrice);

    }
}


class NonVegItem extends FoodItem implements Discountable {
    private double discountPercentage;
    private double NON_VEG_EXTRA_CHARGE = 50;

    public NonVegItem(String itemName, double price, int quantity, double discountPercentage) {
        super(itemName, price, quantity);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = getPrice() * getQuantity();
        return basePrice + (basePrice * 18 / 100) + this.NON_VEG_EXTRA_CHARGE;
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        double discountAmount = calculateTotalPrice() * (discountPercentage / 100);
        return discountAmount;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount on NonVeg Items : " + applyDiscount(discountPercentage));
    }

    @Override
    public void getItemDetails(){
        super.getItemDetails();
        double finalPrice = calculateTotalPrice() - applyDiscount(discountPercentage);
        System.out.println("NonVeg Food Item Price incuding taxes and discount : " + finalPrice);

    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        
        VegItem vegBiryani = new VegItem("Veg Biryani", 250.0, 2, 10);
        VegItem paneerButterMasala = new VegItem("Paneer Butter Masala", 320.0, 1, 12);
        NonVegItem chickenCurry = new NonVegItem("Chicken Curry", 400.0, 1, 15);
        NonVegItem fishFry = new NonVegItem("Fish Fry", 350.0, 2, 10);

        
        List<FoodItem> foodCart = new ArrayList<>();
        foodCart.add(vegBiryani);
        foodCart.add(paneerButterMasala);
        foodCart.add(chickenCurry);
        foodCart.add(fishFry);

        System.out.println("====== Online Food Order Summary ======");
        for (FoodItem item : foodCart) {
            item.getItemDetails();
            System.out.println("---------------------------------");
        }
    }
}

