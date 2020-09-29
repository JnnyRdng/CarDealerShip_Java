package Engines;

public class PetrolEngine extends Engine{

    public PetrolEngine(String fuel) {
        super(fuel);
    }

    public String start() {
        return "Brrrrrm";
    }
}
