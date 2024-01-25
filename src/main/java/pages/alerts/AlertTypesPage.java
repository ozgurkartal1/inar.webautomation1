package pages.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AlertTypesPage extends BasePage {

	@FindBy(xpath = "//button[text()='Show Alert']")
	private WebElement showAlertButton;

	@FindBy(xpath = "//button[text()='Show Confirm']")
	private WebElement showConfirmButton;

	@FindBy(xpath = "//button[text()='Show Prompt']")
	private WebElement showPromptButton;

	public AlertTypesPage() {
		super();
	}

	private Alert getAlert() {
		return driver.switchTo().alert();
	}

	public void clickOnShowAlertButton() {
		showAlertButton.click();
	}

	public void clickOnShowConfirmButton() {
		showConfirmButton.click();
	}

	public void clickOnShowPromptButton() {
		showPromptButton.click();
	}

	public void confirmTheAlert() {
		getAlert().accept();
	}

	public void cancelTheAlert() {
		getAlert().dismiss();
	}

	public String getTextMessageOnAlert() {
		return getAlert().getText();
	}

	public void sendTextToAlert(String value) {
		getAlert().sendKeys(value);
	}

}
