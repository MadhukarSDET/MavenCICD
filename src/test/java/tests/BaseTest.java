package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import utlity.FrameworkConfig;
import utlity.JsonFileReader;

public class BaseTest {

	protected WebDriver driver;
	
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		driver = Driver.initDriver();
	}

	@AfterMethod
	public void teardown() {
		Driver.quitDriver();
	}
}
