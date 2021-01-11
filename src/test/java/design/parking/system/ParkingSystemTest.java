package design.parking.system;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingSystemTest {
    @Test
    public void addCar() {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        assertTrue(parkingSystem.addCar(1));
        assertTrue(parkingSystem.addCar(2));
        assertFalse(parkingSystem.addCar(3));
        assertFalse(parkingSystem.addCar(1));
    }
}