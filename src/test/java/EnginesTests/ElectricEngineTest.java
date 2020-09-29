package EnginesTests;

import Engines.ElectricEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricEngineTest {

    private ElectricEngine petrolEngine;

    @Before
    public void before() {
        petrolEngine = new ElectricEngine("electricity");
    }

    @Test
    public void hasFuelType() {
        assertEquals("electricity", petrolEngine.getFuel());
    }

    @Test
    public void canStart() {
        assertEquals("Whirrrrr", petrolEngine.start());
    }
}
