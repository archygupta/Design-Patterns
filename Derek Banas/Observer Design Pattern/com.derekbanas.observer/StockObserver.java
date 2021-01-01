package com.derekbanas.observer;

public class StockObserver implements Observer{
	private static int ObserverIDTracker=0;
	private int ObserverID;
	
	private double ibmprice;
	private double aaplprice;
	private double googprice;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.ObserverID = ++ObserverIDTracker;
		System.out.println("New observer: "+ this.ObserverID);
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmprice, double aaplprice, double googprice) {
		this.ibmprice = ibmprice;
		this.aaplprice = aaplprice;
		this.googprice = googprice;
		printThePrices();
	}
	private void printThePrices() {
		System.out.println(ObserverID+" \nIBM: "+ibmprice+" \nAAPL: "+aaplprice+" \nGOOG: "+googprice);
	}

}
