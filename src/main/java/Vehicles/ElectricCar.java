package Vehicles;

import Engines.ElectricEngine;

public class ElectricCar extends Vehicle {

    public ElectricCar(String colour, double price) {
        super(colour, price, new ElectricEngine("electricity"));
    }
}
