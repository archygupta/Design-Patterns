package com.geeksforgeeks.singleton;

public class Singleton {
	private static Singleton singleton = null;
	public String str;

	private Singleton() {
		str = "You are dealing with a singleton object!";
	}

	public static Singleton Singleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public static void main(String args[]) {
		Singleton obj1 = Singleton();
		System.out.println(obj1.str);
		obj1.str = "You are again dealing with a singleton object!";
		Singleton obj2 = Singleton();
		System.out.println(obj2.str);
		Singleton obj3 = Singleton();
		obj2.str = (obj2.str).toUpperCase();
		System.out.println("obj1 str: " + obj1.str);
		System.out.println("obj2 str: " + obj2.str);
		System.out.println("obj3 str: " + obj3.str);
	}
}
