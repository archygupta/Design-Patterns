package com.derekbanas.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject{
	
	private ArrayList<Observer> observers;
	private double ibmprice;
	private double aaplprice;
	private double googprice;
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int index = observers.indexOf(o);
		System.out.println("observer deleted: " + index+1);
		observers.remove(index);		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(ibmprice, aaplprice, googprice);
		}
	}

	public void setIbmprice(double IBMprice) {
		ibmprice = IBMprice;
		notifyObservers();
	}
	
	public void setAaplprice(double AAPLprice) {
		aaplprice = AAPLprice;
		notifyObservers();
	}

	public void setGoogprice(double GOOGprice) {
		googprice = GOOGprice;
		notifyObservers();
	}
}
