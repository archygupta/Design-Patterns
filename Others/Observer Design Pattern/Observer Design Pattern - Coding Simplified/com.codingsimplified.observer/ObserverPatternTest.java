package com.codingsimplified.observer;

import java.util.ArrayList;

interface Subject {
	void register(Observer observer);
	void unregister(Observer observer);
	void notifyObservers();
}

class DeliveryData implements Subject {
	ArrayList<Observer> observerList;
	String location;

	public DeliveryData() {
		this.observerList = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(location);
		}
	}

	public void locationChanged() {
		this.location = getLoation();
		notifyObservers();
	}

	private String getLoation() {
		return "Y_Place";
	}
}

interface Observer {
	void update(String location);
}

class Seller implements Observer {

	public String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation(location);
	}

	private void showLocation(String location2) {
		System.out.println("Seller at location: " + location);
	}
}

class User implements Observer {

	public String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation(location);
	}

	private void showLocation(String location2) {
		System.out.println("User at location: " + location);
	}
}

class WareHouse implements Observer {
	public String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation(location);
	}

	private void showLocation(String location2) {
		System.out.println("WareHouse at location: " + location);
	}
}

public class ObserverPatternTest {
	public static void main(String args[]) {
		DeliveryData deliveryObj = new DeliveryData();
		Observer sellerObserverObj = new Seller();
		Observer userObserverObj = new User();
		Observer wareHouseObserverObj = new WareHouse();

		deliveryObj.register(sellerObserverObj);
		deliveryObj.register(userObserverObj);
		deliveryObj.register(wareHouseObserverObj);

		deliveryObj.locationChanged();

		deliveryObj.unregister(userObserverObj);
		deliveryObj.locationChanged();
	}
}
