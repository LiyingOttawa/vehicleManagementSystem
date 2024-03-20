/**
 * File name: VehicleDirector.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Lab1
 * Date: 2024-02-07
 * Professor: Gustavo Adami
 * Purpose: VehicleDirector is a director class to practice builder-director design pattern
 */
package lab1.builderPattern;
/**
 * This is a director class
 * providing a fuction called build
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-07
 */
public class VehicleDirector {

	/***
	 * use the reference to buildEngine and buildWheels
	 * @param builder variable to the builder object
	 */
	public void build(VehicleBuilder builder) {
		builder.buildEngine();
		builder.buildWheels();
	}
}
