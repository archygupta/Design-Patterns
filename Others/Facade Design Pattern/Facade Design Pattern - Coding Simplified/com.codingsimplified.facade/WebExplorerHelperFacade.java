package com.codingsimplified.facade;

import java.sql.Driver;

class ChromeDriver {
	public static Driver getChromeDriver() {
		return null;
	}

	public static void generateHTMLReport(String test, Driver driver) {
		System.out.println("Generting HTML Reports with chrome driver");
	}

	public static void generateJunitReport(String test, Driver driver) {
		System.out.println("Generting Junit Reports with chrome driver");
	}
}

class FirefoxDriver {
	public static Driver getFireFoxDriver() {
		return null;
	}

	public static void generateHTMLReport(String test, Driver driver) {
		System.out.println("Generting HTML Reports with firefox driver");
	}

	public static void generateJunitReport(String test, Driver driver) {
		System.out.println("Generting Junit Reports with firefox driver");
	}
}

class WebExplorerHelper {
	public static void generateReports(String explorer, String test, String report) {
		Driver driver = null;
		switch (explorer) {
		case "chrome":
			driver = ChromeDriver.getChromeDriver();
			switch (report) {
			case "HTML":
				ChromeDriver.generateHTMLReport(test, driver);
				break;
			case "Junit":
				ChromeDriver.generateJunitReport(test, driver);
				break;
			}
			break;
		case "firefox":
			driver = FirefoxDriver.getFireFoxDriver();
			switch (report) {
			case "HTML":
				FirefoxDriver.generateHTMLReport(test, driver);
				break;
			case "Junit":
				FirefoxDriver.generateJunitReport(test, driver);
				break;
			}
			break;
		}
	}
}

public class WebExplorerHelperFacade {
	public static void main(String args[]) {
		String test = "facade design pattern";
		WebExplorerHelper.generateReports("firefox", test, "HTML");
		WebExplorerHelper.generateReports("firefox", test, "Junit");
		WebExplorerHelper.generateReports("chrome", test, "HTML");
		WebExplorerHelper.generateReports("chrome", test, "Junit");
	}
}
