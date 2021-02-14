package code.codingsimplified.prototype;

import java.util.*;

class Vehicle implements Cloneable {
	private List<String> vehicleList;

	public Vehicle() {
		this.vehicleList = new ArrayList();
	}

	public Vehicle(List<String> list) {
		this.vehicleList = list;
	}

	public List<String> getList() {
		return this.vehicleList;
	}

	public void insertData() {
		vehicleList.add("Honda amaze");
		vehicleList.add("Honda city");
		vehicleList.add("Audi A4");
		vehicleList.add("Renault Dustor");
		vehicleList.add("BMU");
	}

	public void printVehicles() {
		for (String s : this.vehicleList) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList();
		for (String s : vehicleList) {
			tempList.add(s);
		}
		return new Vehicle(tempList);
	}
}

public class VehiclePrototypeExample {
	public static void main(String args[]) throws CloneNotSupportedException {
		Vehicle a = new Vehicle();
		a.insertData();
		a.printVehicles();

		Vehicle b = (Vehicle) a.clone();
		b.printVehicles();

		a.getList().remove("BMU");
		a.printVehicles();

		b.getList().add("Skoda");
		b.printVehicles();
	}

}
