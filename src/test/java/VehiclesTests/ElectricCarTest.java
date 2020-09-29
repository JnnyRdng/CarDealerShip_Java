package VehiclesTests;

import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private ElectricCar electricCar;

    @Before
    public void before() {
        electricCar = new ElectricCar("green", 12000);
    }

    @Test
    public void canGetColour() {
        assertEquals("green", electricCar.getColour());
    }

    @Test
    public void canGetEngine() {
        assertEquals("electricity", electricCar.getEngine().getFuel());
    }

    @Test
    public void canGetPrice() {
        assertEquals(12000, electricCar.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice() {
        electricCar.setPrice(11000);
        assertEquals(11000, electricCar.getPrice(), 0.01);
    }

    @Test
    public void canStartEngine() {
        assertEquals("Whirrrrr", electricCar.start());
    }
}
