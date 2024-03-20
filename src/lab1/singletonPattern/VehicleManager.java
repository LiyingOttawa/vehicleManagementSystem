/**
 * File name: VehicleManager.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Lab1
 * Date: 2024-02-07
 * Professor: Gustavo Adami
 * Purpose: VehicleManager is a singleton class
 */
package lab1.singletonPattern;

import java.util.ArrayList;

import lab1.common.Vehicle;
/**
 * This is the singleton class to keep vehicles in array list
 * It hides constructor to prevent from creating more then one object of VehicleManager
 * With the program, only one instance of VehicleManager can be created via static function getInstance()
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-07
 */
public class VehicleManager {
	
	/***
	 * class variable which only access by static function
	 * this is variable reference to the singleton
	 */
	private static VehicleManager vehicleManager;
	/***
	 * this is object's variable
	 * reference to an array, add vehicle to the list by 
	 * object function addAndRetrieve function
	 */
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	/***
	 * make the default constructor private to prevent from 
	 * creating multiple object outside this class
	 */
	private VehicleManager() {
		
	}
	
	/***
	 * class function to access class'variable
	 * if the variable is null, then create the singleton object
	 * otherwise, return the variable.
	 * @return singleton object
	 */
	public static VehicleManager getInstance() {
		if(vehicleManager == null) {
			vehicleManager = new VehicleManager();
		}
		return vehicleManager;
	}

	/***
	 * add given vehicle to list
	 * @param vehicle vehicle to add to vehicles
	 * @return vehicles
	 */
	public ArrayList<Vehicle> addAndRetrieve(Vehicle vehicle) {
		vehicles.add(vehicle);
		return vehicles;
	}

	/**
	 * @return the vehicles
	 */
	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}
	
}
