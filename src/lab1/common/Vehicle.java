/**
 * File name: Vehicle.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Lab1
 * Date: 2024-02-07
 * Professor: Gustavo Adami
 * Purpose: Vehicle is a interface
 */
package lab1.common;
/**
 * This is an abstract class
 * with two functions:start and stop
 * two variables: engine and wheels
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-07
 */
public abstract class Vehicle {
	private String engine;
	private int wheels;

	public abstract void start();

	public abstract void stop();

	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * @param engine the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}

	/**
	 * @return the wheels
	 */
	public int getWheels() {
		return wheels;
	}

	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
}
