import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership(double till) {
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.stock.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.stock.remove(vehicle);
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

    public void buy(Vehicle vehicle) {
        decreaseTill(vehicle.getPrice());
        addVehicle(vehicle);
    }

    public void sell(Customer customer, Vehicle vehicle) {
        if (customer.buy(vehicle)) {
            removeVehicle(vehicle);
            increaseTill(vehicle.getPrice());
        }
    }

    public void repairVehicle(Vehicle vehicle, double amount) {
        if (getTill() >= amount) {
            vehicle.repair(amount);
            decreaseTill(amount);
        }
    }
}
