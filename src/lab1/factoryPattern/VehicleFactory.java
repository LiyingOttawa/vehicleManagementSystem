/**
 * File name: VehicleFactory.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Lab1
 * Date: 2024-02-07
 * Professor: Gustavo Adami
 * Purpose: VehicleFactory is a factory class to practice factory design pattern
 */
package lab1.factoryPattern;

import lab1.common.Car;
import lab1.common.Motorcycle;
import lab1.common.Vehicle;

/**
 * This is the factory class to create an object based on parameter
 * If given type is equal to "car", create a car object
 * otherwise always create a Motorcycle object
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-07
 */
public class VehicleFactory {

	/***
	 * this function will return created vehicle either a car or a motorcycle 
	 * according to the passed type
	 * @param type type of vehicle to create
	 * @return a vehicle created
	 */
	public Vehicle createVehicle(String type) {
		
		Vehicle vehicle = null;
		if("car".equals(type)) {
			vehicle = new Car();
		}
		else {
			vehicle = new Motorcycle();
		}
		return vehicle;
	}
}
