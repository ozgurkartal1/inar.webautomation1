package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import javax.naming.OperationNotSupportedException;

public class Driver {

	private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

	private Driver() throws OperationNotSupportedException {
		throw new UnsupportedOperationException();
	}

	public static WebDriver getDriver() {
		return getDriver(System.getProperty("browser", "chrome"));
	}

	public static WebDriver getDriver(String browserType) {
		WebDriver driver;
		if (DRIVER_THREAD_LOCAL.get() == null) {

			switch (browserType.toLowerCase()) {
				case "firefox" -> {
					FirefoxOptions firefoxOptions = new FirefoxOptions();
					firefoxOptions.addArguments("--width-1920");
					firefoxOptions.addArguments("--height-1080");
					driver = new FirefoxDriver(firefoxOptions);
				}
				case "edge" -> {
					EdgeOptions edgeOptions = new EdgeOptions();
					edgeOptions.addArguments("--start-maximized");
					edgeOptions.addArguments("--ignore-certificate-error");
					driver = new EdgeDriver(edgeOptions);
				}

				default -> {
					ChromeOptions chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("--start-maximized");
					chromeOptions.addArguments("--ignore-certificate-error");
					driver = new ChromeDriver(chromeOptions);
				}
			}

			DRIVER_THREAD_LOCAL.set(driver);
			driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com");
		}

		return DRIVER_THREAD_LOCAL.get();
	}

	public static void quitDriver() {
		WebDriver driver = DRIVER_THREAD_LOCAL.get();
		if (driver != null) {
			driver.quit();
			DRIVER_THREAD_LOCAL.remove();
		}
	}

}
