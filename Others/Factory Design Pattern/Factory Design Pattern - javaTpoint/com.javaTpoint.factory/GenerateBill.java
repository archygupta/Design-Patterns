package com.javaTpoint.factory;

import java.util.Scanner;

public class GenerateBill {
	public static void main(String args[]) {
		GetPlanFactory planFactoryObject = new GetPlanFactory();
		Scanner sc = new Scanner(System.in);
		String planType = sc.next();
		int units = sc.nextInt();
		Plan plan = planFactoryObject.getPlan(planType);
		System.out.println("Plan: " + planType);
		plan.setRate();
		System.out.println("Bill: " + plan.calculateBill(units));
	}
}
