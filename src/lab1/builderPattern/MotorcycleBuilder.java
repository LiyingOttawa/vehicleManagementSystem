/**
 * File name: MotorcycleBuilder.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Lab1
 * Date: 2024-02-07
 * Professor: Gustavo Adami
 * Purpose: MotorcycleBuilder is a builder class to practice builder-director design pattern
 */
package lab1.builderPattern;

import lab1.common.Motorcycle;
import lab1.common.Vehicle;

/**
 * This is a builder class for car
 * It has strong dependency with Motorcycle class(composition)
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-07
 */
public class MotorcycleBuilder implements VehicleBuilder{

	private Motorcycle motorcycle = new Motorcycle();
    /*
     * Returns an instance of this PersonBuilder
     */
    public static MotorcycleBuilder create() { return new MotorcycleBuilder(); }
    
	private String engine="motorcycle engin";
	private int wheels=2;
	
	public MotorcycleBuilder engine(String engine)
	{
		this.engine= engine;
		return this;
	}
	
	public MotorcycleBuilder wheels(int wheels)
	{
		this.wheels= wheels;
		return this;
	}
	/***
	 * set engine to "motorcycle Engine"
	 */
	public void buildEngine() {
		motorcycle.setEngine(engine);
		
	}

	/***
	 * set wheels to 4
	 */
	public void buildWheels() {
		motorcycle.setWheels(wheels);
		
	}

	/***
	 * get the dependency motorcycle
	 */
	public Vehicle getVehicle() {
		return motorcycle;
	}

	public Vehicle build() {
		Motorcycle motorcycle = new Motorcycle();
		motorcycle.setEngine(engine);
		motorcycle.setWheels(wheels);
		return motorcycle;
	}

}
