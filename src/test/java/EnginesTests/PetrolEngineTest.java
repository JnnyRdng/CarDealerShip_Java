package EnginesTests;

import Engines.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolEngineTest {

    private PetrolEngine petrolEngine;

    @Before
    public void before() {
        petrolEngine = new PetrolEngine("Petrol");
    }

    @Test
    public void hasFuelType() {
        assertEquals("Petrol", petrolEngine.getFuel());
    }

    @Test
    public void canStart() {
        assertEquals("Brrrrrm", petrolEngine.start());
    }
}
