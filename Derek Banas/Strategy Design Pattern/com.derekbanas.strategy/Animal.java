
package com.derekbanas.strategy;

public class Animal {
	
	private String sound;
	private String name;
	private Flys flyingType;
	 public void setSound(String s) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}
	 
	 public void setFlyingType(Flys newFlyingType) {
		 flyingType = newFlyingType;
	 }
	 
	 public String tryToFly() {
		 return flyingType.fly();
	 }
}
