package com.derekbanas.observer;

public class GrabStocks {
	public static void main(String args[]) {
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1  = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmprice(1.0);
		stockGrabber.setAaplprice(2.0);
		stockGrabber.setGoogprice(3.0);
		
    StockObserver observer2  = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmprice(1.01);
		stockGrabber.setAaplprice(2.02);
		stockGrabber.setGoogprice(3.03);
		
		stockGrabber.unregister(observer2);
		stockGrabber.setIbmprice(1.012);
		stockGrabber.setAaplprice(2.023);
		stockGrabber.setGoogprice(3.034);
	}
}
