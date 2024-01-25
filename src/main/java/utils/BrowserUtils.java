package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

	public static void pageDown() {
		Actions actions = new Actions(Driver.getDriver());
		actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
		wait(1);
	}

	public static void pageUp() {
		Actions actions = new Actions(Driver.getDriver());
		actions.keyDown(Keys.PAGE_UP).keyUp(Keys.PAGE_UP).perform();
		wait(1);
	}

	public static void wait(double seconds) {
		try {
			Thread.sleep((long) (seconds * 1000));
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000L);
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
