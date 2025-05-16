package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utlity.ConFactory;

public class Driver {

	public static WebDriver driver;
	
	public static WebDriver initDriver() {

		String browser = ConFactory.getConfig().browser();
		if (browser.equalsIgnoreCase("chrome")) {
			if (driver == null) {
				driver = new ChromeDriver();
			}
		} else if (browser.equalsIgnoreCase("edge")) {
			if (driver == null) {
				driver = new EdgeDriver();
			}
		} else {
			if (driver == null) {
				driver = new FirefoxDriver();
			}
		}
		DriverManager.setDriver(driver);
		DriverManager.getDriver().get(ConFactory.getConfig().url());
		DriverManager.getDriver().manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(ConFactory.getConfig().timeouts()));

		return DriverManager.getDriver();

	}

	public static void quitDriver() {
		if (DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
		}
	}

}
