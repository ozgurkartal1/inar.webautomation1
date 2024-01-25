package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(linkText = "Webautomation")
	private WebElement webAutomationLink;

	public HomePage() {
		super();
	}

	public void clickOnWebautomationLink() {
		webAutomationLink.click();
	}

}
