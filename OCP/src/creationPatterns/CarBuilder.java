package creationPatterns;

import java.util.List;

/**
 * Builder patterns are usually used as inner or static inner classes to avail of 
 * private constructors.
 *
 */

public class CarBuilder {
	private int numberOfWheels;
	private String brand;
	private List<String> models;
	
	public CarBuilder() {
		
	}
	
	public CarBuilder setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
		return this;
	}
	public CarBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public CarBuilder setModels(List<String> models) {
		this.models = models;
		return this;
	}
	
	public CarImmutable build() {
		return new CarImmutable(numberOfWheels, brand, models);
	}
	

}
