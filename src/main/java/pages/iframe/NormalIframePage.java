package pages.iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NormalIframePage extends BasePage {

	@FindBy(tagName = "h1")
	private WebElement titleOnTheFrame;

	@FindBy(id = "nestedIframe")
	private WebElement frame;

	public void moveToFrame() {
		driver.switchTo().frame(frame);
	}

	public String getTitleOnFrame() {
		moveToFrame();
		return titleOnTheFrame.getText();
	}

}
