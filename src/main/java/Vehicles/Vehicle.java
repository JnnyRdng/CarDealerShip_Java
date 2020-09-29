package Vehicles;

import Engines.Engine;

public abstract class Vehicle {

    private Engine engine;
    private String colour;
    private double price;

    public Vehicle(String colour, double price, Engine engine) {
        this.colour = colour;
        this.price = price;
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String start() {
        return engine.start();
    }
}
