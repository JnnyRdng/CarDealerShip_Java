import Vehicles.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    private Customer customer;
    private PetrolCar petrolCar;

    @Before
    public void before() {
        customer = new Customer(8000);
        petrolCar = new PetrolCar("purple", 5000);
    }

    @Test
    public void getOwnedVehicles() {
        assertEquals(0, customer.getVehicles().size());
    }

    @Test
    public void canAddVehicle() {
        customer.addVehicle(petrolCar);
        assertEquals(1, customer.getVehicles().size());
    }

    @Test
    public void getWallet() {
        assertEquals(8000, customer.getWallet(), 0.01);
    }

    @Test
    public void canDecreaseWallet() {
        customer.decreaseWallet(800);
        assertEquals(7200, customer.getWallet(), 0.01);
    }

    @Test
    public void canBuyVehicle() {
        boolean sold = customer.buy(petrolCar);
        assertEquals(3000, customer.getWallet(), 0.01);
        assertEquals(1, customer.getVehicles().size());
        assertTrue(sold);
    }

    @Test
    public void canNotBuyIfNotEnoughMoney() {
        PetrolCar superCar = new PetrolCar("yellow", 4000000);
        boolean sold = customer.buy(superCar);
        assertFalse(sold);
    }
}
