package creationPatterns;

/**
 * It is important when creating immutable objects that any mutable 
 * input arguments are copied to the instance instead of being used directly.
 * 
 * String is immutable so we can use it directly, but int and list are mutable
 * so we create a new object and copy the data so the class that creates the immutable object
 * does not have a reference to the mutable data in the immutable class.
 * 
 * The immutable class needs to final so it can't be extended.
 */

import java.util.ArrayList;
import java.util.List;

public final class TruckImmutable extends Vehicle{
	private final int numberOfWheels;
	private final String brand;
	private final List<String> models;
	
	public TruckImmutable(int numberOfWheels, String brand, List<String> list) {
		this.numberOfWheels = new Integer(numberOfWheels);
		this.brand = brand;
		
		if(list == null) {
			throw new RuntimeException("list of strings is required");
		}
		this.models = new ArrayList<String>(list);
	}
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public String getBrand() {
		return brand;
	}
	
	public int getListSize() {
		return models.size();
	}
	
	public String getFromList(int index) {
		return models.get(index);
	}

	@Override 
	public String toString() {
		return "model: " + models.get(0) +  "\nWheels: " + numberOfWheels + "\nBrand: " + brand; 
	}
}
