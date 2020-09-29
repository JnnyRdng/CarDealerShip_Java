import Vehicles.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private PetrolCar petrolCar;

    @Before
    public void before() {
        dealership = new Dealership(10000);
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
    public void canRemoveVehicle() {
        dealership.addVehicle(petrolCar);
        dealership.removeVehicle(petrolCar);
        assertEquals(0, dealership.getVehicles().size());
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

    @Test
    public void canBuyVehicle() {
        dealership.buy(petrolCar);
        assertEquals(2000, dealership.getTill(), 0.01);
        assertEquals(1, dealership.getVehicles().size());
    }

    @Test
    public void canSellVehicle() {
        Customer customer = new Customer(10000);
        dealership.addVehicle(petrolCar);
        dealership.sell(customer, petrolCar);
        assertEquals(18000, dealership.getTill(), 0.01);
        assertEquals(0, dealership.getVehicles().size());
    }

    @Test
    public void canNotSellExpensiveVehicleToPoorCustomer() {
        Customer customer = new Customer(1000);
        dealership.addVehicle(petrolCar);
        dealership.sell(customer, petrolCar);
        assertEquals(10000, dealership.getTill(), 0.01);
        assertEquals(1, dealership.getVehicles().size());
    }

    @Test
    public void canRepairVehicle() {
        dealership.repairVehicle(petrolCar, 5000);
        assertEquals(13000, petrolCar.getPrice(), 0.01);
        assertEquals(5000, dealership.getTill(), 0.01);
    }

    @Test
    public void tooExpensiveToRepair() {
        dealership.repairVehicle(petrolCar, 20000);
        assertEquals(8000, petrolCar.getPrice(), 0.01);
        assertEquals(10000, dealership.getTill(), 0.01);
    }
}
