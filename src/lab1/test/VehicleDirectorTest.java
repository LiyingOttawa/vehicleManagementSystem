/**
 * File name: VehicleDirectorTest.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Lab1
 * Date: 2024-02-07
 * Professor: Gustavo Adami
 * Purpose: VehicleDirectorTest is a JUnit test class to test VehicleDirector
 */
package lab1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab1.builderPattern.CarBuilder;
import lab1.builderPattern.VehicleBuilder;
import lab1.builderPattern.VehicleDirector;
import lab1.common.Car;

public class VehicleDirectorTest {

	@Test
	public void testBuild() {
		VehicleDirector vehicleDirector = new VehicleDirector();
		VehicleBuilder carBuilder = new CarBuilder();
		Car result1 = (Car)carBuilder.getVehicle();
		assertEquals(0,result1.getWheels());
		vehicleDirector.build(carBuilder);
		assertEquals(4,result1.getWheels());
	}

}
