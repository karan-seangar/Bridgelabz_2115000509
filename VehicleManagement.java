interface Refuelable {
    void refuel();
}

class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling.");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250);
        PetrolVehicle bmw = new PetrolVehicle("BMW M3", 280);

        tesla.displayInfo();
        tesla.charge();
        System.out.println();
        
        bmw.displayInfo();
        bmw.refuel();
    }
}
