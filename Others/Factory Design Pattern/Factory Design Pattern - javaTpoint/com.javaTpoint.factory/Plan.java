package com.javaTpoint.factory;

public abstract class Plan {
	double rate;

	abstract void setRate();

	double calculateBill(int units) {
		return units * rate;
	}
}
