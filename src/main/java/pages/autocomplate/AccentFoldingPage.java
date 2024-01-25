package pages.autocomplate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class AccentFoldingPage extends BasePage {

	@FindBy(id = "developer-accentFolding")
	private WebElement textField;

	@FindBy(css = "#ui-id-40 > li")
	private List<WebElement> autoTextFields;

	public AccentFoldingPage() {
		super();
	}

	public void sendTextToTextField(String value) {
		textField.sendKeys(value);
	}

	public void clickOnAutoTextFields(int index) {
		autoTextFields.get(index - 1).click();
	}

	public List<String> getTexts() {
		List<String> result = new ArrayList<>();
		for (WebElement w : autoTextFields) {
			result.add(w.findElement(By.tagName("div")).getText());
		}
		return result;
	}

	public void cleanTextBox() {
		actions.keyDown(Keys.BACK_SPACE).perform();
		actions.keyDown(Keys.BACK_SPACE).perform();
		actions.keyUp(Keys.BACK_SPACE).perform();

	}

}
