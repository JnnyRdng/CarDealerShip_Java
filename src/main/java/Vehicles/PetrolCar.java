package Vehicles;

import Engines.PetrolEngine;

public class PetrolCar extends Vehicle {

    public PetrolCar(String colour, double price) {
        super(colour, price, new PetrolEngine("petrol"));
    }
}
