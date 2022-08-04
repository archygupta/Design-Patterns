/*
 *Creational Design Pattern
 * 
 * Too many parameters in constructor, its difficult to maintain the order
 * 
 * -- with this, no need to maintain the order
 * no need of passing all parameters, only required ones(generally otherwise we send null for optional parameters)
 */
 
 package com.codingsimplified.builder;

class Vehicle {
	// mandatory params
	private String engine;
	private int wheels;

	// optional params
	private int airbags;

	private Vehicle(VehicleBuilder builder) {
		this.engine = builder.engine;
		this.wheels = builder.wheels;
		this.airbags = builder.airbags;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getAirbags() {
		return airbags;
	}

	public static class VehicleBuilder {
		// mandatory params
		private String engine;
		private int wheels;

		// optional params
		private int airbags;

		public VehicleBuilder(String engine, int wheels) {
			this.engine = engine;
			this.wheels = wheels;
		}

		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}

		public Vehicle build() {
			return new Vehicle(this);
		}
	}
}

class VehicleBuilderExample {
	public static void main(String args[]) {
		Vehicle Car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();
		Vehicle Bike = new Vehicle.VehicleBuilder("1200cc", 2).build();

		System.out.println(Car.getEngine());
		System.out.println(Car.getWheels());
		System.out.println(Car.getAirbags());

		System.out.println(Bike.getEngine());
		System.out.println(Bike.getWheels());
		System.out.println(Bike.getAirbags());
	}
}
