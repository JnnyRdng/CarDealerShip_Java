package VehiclesTests;

import Vehicles.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    private PetrolCar petrolCar;

    @Before
    public void before() {
        petrolCar = new PetrolCar("red", 10000);
    }

    @Test
    public void canGetColour() {
        assertEquals("red", petrolCar.getColour());
    }

    @Test
    public void canGetEngine() {
        assertEquals("petrol", petrolCar.getEngine().getFuel());
    }

    @Test
    public void canGetPrice() {
        assertEquals(10000, petrolCar.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice() {
        petrolCar.setPrice(9000);
        assertEquals(9000, petrolCar.getPrice(), 0.01);
    }

    @Test
    public void canStartEngine() {
        assertEquals("Brrrrrm", petrolCar.start());
    }

    @Test
    public void canDamageCar() {
        petrolCar.damage(2000);
        assertEquals(8000, petrolCar.getPrice(), 0.01);
    }

    @Test
    public void canRepairCar() {
        petrolCar.repair(1000);
        assertEquals(11000, petrolCar.getPrice(), 0.01);
    }
}
