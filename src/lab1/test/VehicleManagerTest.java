/**
 * File name: VehicleFactoryTest.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Lab1
 * Date: 2024-02-07
 * Professor: Gustavo Adami
 * Purpose: VehicleManagerTest is a JUnit test class to test VehicleManager
 */
package lab1.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import lab1.common.Car;
import lab1.common.Vehicle;
import lab1.singletonPattern.VehicleManager;

public class VehicleManagerTest {

	@Test
	public void testGetInstance() {
		VehicleManager test1 = VehicleManager.getInstance();
		VehicleManager test2 = VehicleManager.getInstance();
		
		assertEquals(test1, test2);
	}

	@Test
	public void testAddAndRetrieve() {
		VehicleManager test1 = VehicleManager.getInstance();
		VehicleManager test2 = VehicleManager.getInstance();
		Car car = new Car();
		test1.addAndRetrieve(car);

		ArrayList<Vehicle> result1 = test1.getVehicles();
		ArrayList<Vehicle> result2 = test2.getVehicles();
		
		assertEquals((Car)(result1.get(0)),car);
		assertEquals((Car)(result2.get(0)),car);
	}
}
