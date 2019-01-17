package creationPatterns;

import java.util.Arrays;

public class VehicleFactory {
	
	public static Vehicle getVehicle(String type) {
		
		switch(type) {
		case "car": return new CarImmutable(4,"ford", Arrays.asList("KA"));
		case "truck": return new TruckImmutable(6, "ford", Arrays.asList("flatbed"));
		default: throw new RuntimeException("Vehicle type unknown");
		}
	}

}
