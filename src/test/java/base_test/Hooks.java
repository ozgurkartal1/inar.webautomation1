package base_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import utils.Driver;
import utils.Pages;

public class Hooks {

	protected Pages pages;

	protected SoftAssert softAssert = new SoftAssert();
	protected WebDriver driver;
	@BeforeClass
	public void setUpTestEnvironment() {
		driver = Driver.getDriver();
		pages = new Pages();
	}


	@AfterClass
	public void tearDownTestEnvironment() {
		Driver.quitDriver();
	}

}
