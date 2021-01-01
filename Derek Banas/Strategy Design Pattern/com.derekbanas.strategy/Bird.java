
package com.derekbanas.strategy;

public class Bird extends Animal{

	public Bird() {
		setSound("Chirp");
		setFlyingType(new ItFlys());
	}

}
