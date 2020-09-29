import Vehicles.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private PetrolCar petrolCar;

    @Before
    public void before() {
        dealership = new Dealership();
        petrolCar = new PetrolCar("blue", 8000);
    }

    @Test
    public void getVehicles() {
        assertEquals(0, dealership.getVehicles().size());
    }

    @Test
    public void canAddVehicle() {
        dealership.addVehicle(petrolCar);
        assertEquals(1, dealership.getVehicles().size());
    }

    @Test
    public void canGetTill() {
        assertEquals(10000, dealership.getTill(), 0.01);
    }

    @Test
    public void canAddToTill() {
        dealership.increaseTill(1000);
        assertEquals(11000, dealership.getTill(), 0.01);
    }

    @Test
    public void canRemoveFromTill() {
        dealership.decreaseTill(1000);
        assertEquals(9000, dealership.getTill(), 0.01);
    }
}
