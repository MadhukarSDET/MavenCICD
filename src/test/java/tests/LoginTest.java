package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("tomsmith", "SuperSecretPassword!");
	}

	@Test
	public void qTest() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("tomsmith", "SuperSecretPassword!");
	}

	@Test
	public void aTest() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("tomsmith", "SuperSecretPassword!");
	}

	@Test
	public void bTest() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("tomsmith", "SuperSecretPassword!");
	}
	
	@Test
	public void cTest() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("tomsmith", "SuperSecretPassword!");
	}

	@Test
	public void dTest() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("tomsmith", "SuperSecretPassword!");
	}
	
	@Test
	public void eTest() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("tomsmith", "SuperSecretPassword!");
	}

	

}