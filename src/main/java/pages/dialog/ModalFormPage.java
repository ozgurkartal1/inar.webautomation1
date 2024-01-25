package pages.dialog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class ModalFormPage extends BasePage {

	@FindBy(css = ".ui-widget.ui-widget-content.mb-4 > tbody > tr")
	protected List<WebElement> users;

	@FindBy(xpath = "//button[text()='Create Account']")
	private WebElement createAccountButton;

	@FindBy(id = "ui-id-148")
	private WebElement titleOfDialog;

	@FindBy(id = "name")
	private WebElement nameTextFieldOnDiolog;

	@FindBy(id = "surname")
	private WebElement surnameTextFieldOnDiolog;

	@FindBy(id = "email")
	private WebElement emailTextFieldOnDiolog;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement sumbitButtonOnDiologPage;

	public ModalFormPage() {
	}

	public void clickOnCreateAccountButton() {
		createAccountButton.click();
	}

	public void enterNameDateOnDiolog(String name) {
		nameTextFieldOnDiolog.sendKeys(name);
	}

	public void enterSurnameDateOnDiolog(String surname) {
		surnameTextFieldOnDiolog.sendKeys(surname);
	}

	public void enterEmailDateOnDiolog(String email) {
		emailTextFieldOnDiolog.sendKeys(email);
	}

	public void clickOnSumbitButtonOnDiolog() {
		sumbitButtonOnDiologPage.click();
	}

	public List<String> enterAllDataOnDiologPage(String name, String surname, String email) {
		List<String> data = new ArrayList<>();
		enterNameDateOnDiolog(name);
		data.add(name);
		enterSurnameDateOnDiolog(surname);
		data.add(surname);
		enterEmailDateOnDiolog(email);
		data.add(email);
		clickOnSumbitButtonOnDiolog();

		return data;
	}

	public List<String> getAllDataOfLastUser() {
		List<String> result = new ArrayList<>();
		for (WebElement w : users.get(users.size() - 1).findElements(By.xpath("td"))) {
			result.add(w.getText());
		}
		return result;
	}

}
