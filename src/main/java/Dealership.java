import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership() {
        this.till = 10000;
        this.stock = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.stock.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return this.stock;
    }

    public void decreaseTill(double amount) {
        this.till -= amount;
    }

    public void increaseTill(double amount) {
        this.till += amount;
    }

    public double getTill() {
        return this.till;
    }
}
