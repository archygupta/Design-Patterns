package com.derekbanas.strategy;

public class Dog extends Animal{

	public Dog() {
		setSound("Bark");
		setFlyingType(new CantFly());
	}

}
