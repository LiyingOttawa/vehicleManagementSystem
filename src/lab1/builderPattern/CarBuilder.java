/**
   * File name: CarBuilder.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Lab1
 * Date: 2024-02-07
 * Professor: Gustavo Adami
 * Purpose: CarBuilder is a builder class to practice builder-director design pattern
 */
package lab1.builderPattern;

import lab1.common.Car;
import lab1.common.Vehicle;

/**
 * This is a builder class for car
 * It has strong dependency with Car class(composition)
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-07
 */
public class CarBuilder implements VehicleBuilder {
	private Car car = new Car();
	private String engine="car engin";
	private int wheels=4;
	
	/***
	 * set engine to "Car Engine"
	 */
	
	public void buildEngine() {
		car.setEngine(engine);
		
	}

	/***
	 * set wheels to 4
	 */
	public void buildWheels() {
		car.setWheels(wheels);
		
	}

    /*
     * Returns an instance of this PersonBuilder
     */
    public static CarBuilder create() { return new CarBuilder(); }
    
	
	
	public CarBuilder engine(String engine)
	{
		this.engine= engine;
		return this;
	}
	
	public CarBuilder wheels(int wheels)
	{
		this.wheels= wheels;
		return this;
	}
	

	/***
	 * get the dependency car
	 */
	public Vehicle getVehicle() {
		return car;
	}

	public Vehicle build() {
		Car car = new Car();
		car.setEngine(engine);
		car.setWheels(wheels);
		return car;
	}
	
}
