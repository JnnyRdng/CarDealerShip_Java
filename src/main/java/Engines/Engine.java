package Engines;

public abstract class Engine implements IStartable {


    private String fuel;

    public Engine(String fuel) {
        this.fuel = fuel;
    }
}
