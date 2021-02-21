package com.codingsimplified.decorator;

interface Dress {
	public void assemble();
}

class BasicDress implements Dress {
	public void assemble() {

	}
}

class DressDecorator implements Dress {
	protected Dress dress;

	public DressDecorator(Dress dress) {
		this.dress = dress;
	}

	public void assemble() {
		this.dress.assemble();
	}
}

class FancyDress extends DressDecorator {
	public FancyDress(Dress c) {
		super(c);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Adding fancy dress");
	}
}

class SportyDress extends DressDecorator {
	public SportyDress(Dress c) {
		super(c);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Adding sporty dress");
	}
}

class CasualDress extends DressDecorator {
	public CasualDress(Dress c) {
		super(c);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Adding casual dress");
	}
}

public class DressDecoratorExample {
	public static void main(String args[]) {
		Dress sportydress = new SportyDress(new BasicDress());
		sportydress.assemble();
		System.out.println();

		Dress fancydress = new FancyDress(new BasicDress());
		fancydress.assemble();
		System.out.println();

		Dress casualdress = new CasualDress(new BasicDress());
		casualdress.assemble();
		System.out.println();

		Dress sportyfancydress = new SportyDress(new FancyDress(new BasicDress()));
		sportyfancydress.assemble();
		System.out.println();

		Dress sportyCasualdress = new SportyDress(new CasualDress(new BasicDress()));
		sportyCasualdress.assemble();
		System.out.println();

		Dress casualFancydress = new CasualDress(new FancyDress(new BasicDress()));
		casualFancydress.assemble();
		System.out.println();

	}
}
