/**
 * File name: VehicleFactoryTest.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Lab1
 * Date: 2024-02-07
 * Professor: Gustavo Adami
 * Purpose: VehicleFactoryTest is a JUnit test class to test VehicleFactory
 */
package lab1.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lab1.common.Car;
import lab1.common.Vehicle;
import lab1.factoryPattern.VehicleFactory;

public class VehicleFactoryTest {

	@Test
	public void testCreateVehicle() {
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle test1 = vehicleFactory.createVehicle("car");
		Boolean result = test1 instanceof Car;
		assertTrue(result);
	}

}
