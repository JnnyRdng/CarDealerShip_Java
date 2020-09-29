import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Vehicle>owned;
    private double wallet;

    public Customer(double wallet){
        this.owned = new ArrayList<>();
        this.wallet = wallet;
    }

    public void addVehicle(Vehicle vehicle){
        this.owned.add(vehicle);
    }
    public ArrayList<Vehicle>getVehicles(){
        return this.owned;
    }
    public void decreaseWallet(double amount) {
        this.wallet -= amount;
    }
    public double getWallet(){
        return this.wallet;
    }

    public boolean buy(Vehicle vehicle) {
        if (getWallet() >= vehicle.getPrice()) {
            decreaseWallet(vehicle.getPrice());
            addVehicle(vehicle);
            return true;
        }
        return false;
    }
}
