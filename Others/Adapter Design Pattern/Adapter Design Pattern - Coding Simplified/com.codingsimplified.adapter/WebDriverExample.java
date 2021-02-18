package com.codingsimplified.adapter;

interface Driver {
	public void getElement();
	public void selectElement();
}

class ChromeDriver implements Driver {

	@Override
	public void getElement() {
		System.out.println("chrome driver get element");

	}

	@Override
	public void selectElement() {
		System.out.println("chrome driver select element");
	}

}

class IEDriver {
	public void findElement() {
		System.out.println("IE driver find element");
	}

	public void clickElement() {
		System.out.println("IE driver click element");
	}
}

class WebDriver implements Driver {
	IEDriver ieDriver;

	public WebDriver(IEDriver ieDriver) {
		this.ieDriver = ieDriver;
	}

	@Override
	public void getElement() {
		ieDriver.findElement();
	}

	@Override
	public void selectElement() {
		ieDriver.clickElement();
	}
}

public class WebDriverExample {
	public static void main(String args[]) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.getElement();
		chromeDriver.selectElement();

		IEDriver ieDriver = new IEDriver();
		ieDriver.findElement();
		ieDriver.clickElement();

		Driver driver = new WebDriver(ieDriver);
		driver.getElement();
		driver.selectElement();
	}
}
