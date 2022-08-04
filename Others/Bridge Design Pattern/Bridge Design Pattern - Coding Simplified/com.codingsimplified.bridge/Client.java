/*
 * Structural
 * 
 * Used when we've hiearchies in both interfaces as well as implementationd & we want
 * to hide implementatio from client
 * 
 * it decouple abstraction from implementation
 */
 
 package com.codingsimplified.bridge;

abstract class TV {
	Remote remote;

	public TV(Remote remote) {
		this.remote = remote;
	}

	public void on() {
	}

	public void off() {
	}
}

class Sony extends TV {

	Remote remote;

	public Sony(Remote remote) {
		super(remote);
		this.remote = remote;
	}

	@Override
	public void on() {
		System.out.println("Sony TV ON");
	}

	@Override
	public void off() {
		System.out.println("Sony TV OFF");
	}
}

class Philips extends TV {

	Remote remote;

	public Philips(Remote remote) {
		super(remote);
		this.remote = remote;
	}

	@Override
	public void on() {
		System.out.println("Philips TV ON");
	}

	@Override
	public void off() {
		System.out.println("Philips TV OFF");
	}
}

interface Remote {
	public void on();
	public void off();
}

class OldRemote implements Remote {
	@Override
	public void on() {
		System.out.println("Old remote ON");
	}

	@Override
	public void off() {
		System.out.println("Old remote OFF");
	}
}

class NewRemote implements Remote {
	@Override
	public void on() {
		System.out.println("New remote ON");
	}

	@Override
	public void off() {
		System.out.println("New remote ON");
	}
}

public class Client {
	public static void main(String args[]) {
		TV sonyWithOld = new Sony(new OldRemote());
		sonyWithOld.on();
		sonyWithOld.off();

		TV sonyWithNew = new Sony(new NewRemote());
		sonyWithNew.on();
		sonyWithNew.off();

		TV philipsWithOld = new Philips(new OldRemote());
		philipsWithOld.on();
		philipsWithOld.off();

		TV philipsWithNew = new Philips(new NewRemote());
		philipsWithNew.on();
		philipsWithNew.off();
	}
}
