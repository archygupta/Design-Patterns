//https://www.youtube.com/watch?v=jcGSowIzmzM&list=PLt4nG7RVVk1h9lxOYSOGI9pcP3I5oblbx&index=2

package com.codingsimplified.factory;

abstract class Vehicle {
	abstract int getWheel();
}

class Car extends Vehicle {
	int wheel;

	Car(int wheel) {
		this.wheel = wheel;
	}

	@Override
	int getWheel() {
		// TODO Auto-generated method stub
		return this.wheel;
	}
}

class Bike extends Vehicle {
	int wheel;

	Bike(int wheel) {
		this.wheel = wheel;
	}

	@Override
	int getWheel() {
		// TODO Auto-generated method stub
		return this.wheel;
	}
}

class VehicleFactory {
	public static Vehicle getVehicle(String vehicle, int wheel) {
		if (vehicle.equals("Car")) {
			return new Car(wheel);
		} else if (vehicle.equals("Bike")) {
			return new Bike(wheel);
		}
		return null;
	}
}

public class FactoryPatternExample {
	public static void main(String args[]) {
		Vehicle v = VehicleFactory.getVehicle("Car", 4);
		System.out.println("number of wheels: " + v.getWheel());
		Vehicle v2 = VehicleFactory.getVehicle("Bike", 2);
		System.out.println("number of wheels: " + v2.getWheel());
	}
}
