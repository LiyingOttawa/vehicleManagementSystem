package lab1;

import lab1.builderPattern.CarBuilder;
import lab1.builderPattern.MotorcycleBuilder;
import lab1.builderPattern.VehicleDirector;
import lab1.common.Vehicle;
import lab1.factoryPattern.VehicleFactory;
import lab1.singletonPattern.VehicleManager;

public class Program {
	/***
	 * This is the entry point for the application
	 * It setup test data with  builder and factory:car1, car2, car3, motorcycle1, motorcycle2,motorcycle3
	 * and push them to VehicleManager singleton instance which referenced by vehicleManager1
	 * two variables reference to the singleton instance vehicleManager1 and vehicleManager2
	 * Only if VehicleManager.getInstance() create single object,
	 * then these two variable will point to the same object
	 * we can use the principle to validate if singleton works or not
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		/***
		 * use director to have test vehicles car1 and motocycle1
		 */
		VehicleDirector director = new VehicleDirector();
		CarBuilder carBuilder1 = CarBuilder.create().engine("car engine test1").wheels(4);
		MotorcycleBuilder motorcycleBuilder1 =  MotorcycleBuilder.create().engine("motorcycle engine test1").wheels(2);
		director.build(carBuilder1);
		director.build(motorcycleBuilder1);
		Vehicle car1 = carBuilder1.getVehicle();
		Vehicle motorcycle1 = motorcycleBuilder1.getVehicle();
		/***
		 * use builder to have test vehicles car2 and motocycle2
		 */
		Vehicle car2 = CarBuilder.create().engine("car engine test2").wheels(4).build();
		Vehicle motorcycle2=  MotorcycleBuilder.create().engine("motorcycle engine test2").wheels(2).build();

		/***
		 * use factor to have test vehicles car3 and motocycle3
		 */
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle car3 = vehicleFactory.createVehicle("car");
		Vehicle motorcycle3 = vehicleFactory.createVehicle("motorCycle");
		
		VehicleManager vehicleManager1 = VehicleManager.getInstance();
		vehicleManager1.addAndRetrieve(car1);
		vehicleManager1.addAndRetrieve(motorcycle1);
		vehicleManager1.addAndRetrieve(car2);
		vehicleManager1.addAndRetrieve(motorcycle2);
		vehicleManager1.addAndRetrieve(car3);
		vehicleManager1.addAndRetrieve(motorcycle3);
		
		VehicleManager vehicleManager2 = VehicleManager.getInstance();
		if(vehicleManager1.getVehicles().size() == vehicleManager2.getVehicles().size())
		{
			System.out.println("VehicleManager is a singleton");

		}
	}

}
