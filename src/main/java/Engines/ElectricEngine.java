package Engines;

public class ElectricEngine extends Engine {

    public ElectricEngine(String fuel) {
        super(fuel);
    }

    public String start() {
        return "Whirrrrr";
    }
}
