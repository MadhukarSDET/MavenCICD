package tests;

import org.openqa.selenium.WebDriver;

public final class DriverManager { // final - no one can extend this class

	private DriverManager() {
		// private constructor  no one can create object 
	}

	private static ThreadLocal<WebDriver> thread = new ThreadLocal<>();

	public static void setDriver(WebDriver tdriver) {
		thread.set(tdriver);
	}

	public static WebDriver getDriver() {
		return thread.get();
	}

}
