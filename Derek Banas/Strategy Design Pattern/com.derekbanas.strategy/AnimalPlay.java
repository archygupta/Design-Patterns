
package com.derekbanas.strategy;

public class AnimalPlay {
	public static void main(String args[]) {
		Animal dog = new Dog();
		System.out.println(dog.tryToFly());
		Animal bird = new Bird();
		System.out.println(bird.tryToFly());
		dog.setFlyingType(new ItFlys());
		System.out.println(dog.tryToFly());
	}
}
