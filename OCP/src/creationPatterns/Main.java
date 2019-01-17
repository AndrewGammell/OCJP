package creationPatterns;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		AnimalSingleton animal = AnimalSingleton.getInstance();

		System.out.println(animal.getName());
		
		CarImmutable car = new CarBuilder()
				.setBrand("ford")
				.setModels(Arrays.asList("focus"))
				.setNumberOfWheels(4)
				.build();
		
		System.out.println(car);
		
		car = (CarImmutable) VehicleFactory.getVehicle("car");
		TruckImmutable truck = (TruckImmutable) VehicleFactory.getVehicle("truck");
		
		System.out.println("\n\nStraight from the factory\n" + car + "\n\n" + truck );
	}
	

}
