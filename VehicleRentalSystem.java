abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType(){
        return type;
    }

    public void setVehicleType(String type){
        this.type = type;
    }

    public double getRentalRate(){
        return rentalRate;
    }

    abstract double calculateRentalCost(int days);

    public void displayDetails(){
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type : " + type);
        System.out.println("Rental Rate : " + rentalRate);
    }
}

interface Insurable{
    
    double calculateInsurance();

    void getInsuranceDetails();
}

class Car extends Vehicle implements Insurable{
    private double insuranceAmount;
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, String type, double rentalRate, double insuranceAmount, String insurancePolicyNumber){
        super(vehicleNumber, type, rentalRate);
        this.insuranceAmount = insuranceAmount;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days){
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance(){
        return insuranceAmount * 12;
    }

    @Override
    public void getInsuranceDetails(){
        System.out.println("Insurance Policy Number : " + insurancePolicyNumber);
        System.out.println("Insurance Amount : " + insuranceAmount);
        System.out.println("Annual Insurance Cost : " + calculateInsurance());
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        getInsuranceDetails();
    }

}

class Bike extends Vehicle implements Insurable{
    private double insuranceAmount;
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, String type, double rentalRate, double insuranceAmount, String insurancePolicyNumber){
        super(vehicleNumber, type, rentalRate);
        this.insuranceAmount = insuranceAmount;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days){
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance(){
        return insuranceAmount * 12;
    }

    @Override
    public void getInsuranceDetails(){
        System.out.println("Insurance Policy Number : " + insurancePolicyNumber);
        System.out.println("Insurance Amount : " + insuranceAmount);
        System.out.println("Annual Insurance Cost : " + calculateInsurance());
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        getInsuranceDetails();
    }
}

class Truck extends Vehicle implements Insurable{
    private double insuranceAmount;
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String type, double rentalRate, double insuranceAmount, String insurancePolicyNumber){
        super(vehicleNumber, type, rentalRate);
        this.insuranceAmount = insuranceAmount;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days){
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance(){
        return insuranceAmount * 12;
    }

    @Override
    public void getInsuranceDetails(){
        System.out.println("Insurance Policy Number : " + insurancePolicyNumber);
        System.out.println("Insurance Amount : " + insuranceAmount);
        System.out.println("Annual Insurance Cost : " + calculateInsurance());
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        getInsuranceDetails();
    }

}

public class VehicleRentalSystem{
    public static void main(String[] args){
        Vehicle car = new Car("UP85 98AHF", "Car", 1500, 5000, "8332-7282-0283");
        car.displayDetails();
        System.out.println("Rental Cost for 5 days : " + car.calculateRentalCost(5));
        System.out.println();

        Vehicle bike = new Bike("MP76 FRHU", "Bike", 500, 3000, "7329-9283-2829");
        bike.displayDetails();
        System.out.println("Rental Cost for 3 days : " + bike.calculateRentalCost(3));
        System.out.println();

        Vehicle truck = new Truck("HR81 BAKS", "Truck", 4000, 10000, "9338-9372-0234");
        truck.displayDetails();
        System.out.println("Rental Cost for 2 days : " + truck.calculateRentalCost(2));
    }
}



