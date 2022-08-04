
/*
 * Structural
 * used when creation of more than 10^5 objects is needed, to reduce creation of object
 * Create map and store object
 * 
 * Interface: contain common methods, Employee
 * Object: Individual class: Developer, Tester
 *Intrinsic Properties: Which are same for an object  (bug -> dev: fixing bug, tester: finding bug)
 *Extrinsic Properties: which are different for a object (skills-> both dev and tester have different skills
 *We use factory to use return object: employeefactory
 *client:client class
 *
 */
 
 package com.codingsimplified.flyweight;

import java.util.HashMap;
import java.util.Random;

interface Employee {
	public void assignskills(String skill);

	public void task();
}

class Developer implements Employee {

	public final String job;
	public String skill;

	public Developer() {
		this.job = "Fix the bug";
	}

	public void assignskills(String skill) {
		this.skill = skill;
	}

	@Override
	public void task() {
		System.out.println("Developer with skill: " + this.skill + " does the job: " + this.job);
	}
}

class Tester implements Employee {
	public final String job;
	public String skill;

	public Tester() {
		this.job = "find the bug";
	}

	@Override
	public void assignskills(String skill) {
		this.skill = skill;
	}

	@Override
	public void task() {
		System.out.println("Tester with skill: " + this.skill + " does the job: " + this.job);
	}

}

class EmployeeFactory {
	static HashMap<String, Employee> m = new HashMap<>();

	public static Employee getEmployee(String type) {
		Employee p = null;
		if (m.get(type) != null) {
			p = m.get(type);
		} else {
			switch (type) {
			case "Developer":
				p = new Developer();
				System.out.println("Developer created");
				break;
			case "Tester":
				p = new Tester();
				System.out.println("Tester created");
				break;
			default:
				System.out.println("No such employee");
				break;
			}
			m.put(type, p);
		}
		return p;
	}
}

public class EngineeringFlyweight {
	private static String employeeType[] = { "Developer", "Tester" };
	private static String skills[] = { "Java", "C++", "Python" };

	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			Employee e = EmployeeFactory.getEmployee(getRandEmployee());
			e.assignskills(getRandSkill());
			e.task();
		}
	}

	public static String getRandEmployee() {
		Random r = new Random();
		return employeeType[r.nextInt(employeeType.length)];
	}

	public static String getRandSkill() {
		Random r = new Random();
		return skills[r.nextInt(skills.length)];

	}
}
