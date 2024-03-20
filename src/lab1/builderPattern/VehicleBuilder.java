/**
  * File name: VehicleBuilder.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Lab1
 * Date: 2024-02-07
 * Professor: Gustavo Adami
 * Purpose: VehicleBuilder is a interface used to practice builder-director design pattern
 */
package lab1.builderPattern;

import lab1.common.Vehicle;

/**
 * This is an interface
 * with three fuctions:buildEngine, buildWheels and getVehicle
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-07
 */
public interface VehicleBuilder {
	public void buildEngine();
	public void buildWheels();
	public Vehicle getVehicle();	
}
