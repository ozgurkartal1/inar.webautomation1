package pages.controlgroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.List;
import java.util.Set;

public class ToolbarPage extends BasePage {

	@FindBy(css = ".d-flex > .form-select")
	private List<WebElement> selections;

	@FindBy(css = ".d-flex > .btn")
	private List<WebElement> buttons;

	@FindBy(id = "page")
	private WebElement textArea;

	public ToolbarPage() {
		super();
	}

	public void selectZoomAmount(String text) {
		Select select = new Select(selections.get(0));
		select.selectByVisibleText(text);
	}

	public void selectBackgroundColor(String text) {
		Select select = new Select(selections.get(1));
		select.selectByVisibleText(text);
	}

	public void selectTextColor(String text) {
		Select select = new Select(selections.get(2));
		select.selectByVisibleText(text);
	}

	public void selectAllInfo(String t1, String t2, String t3) {
		selectZoomAmount(t1);
		selectBackgroundColor(t2);
		selectTextColor(t3);
	}

	public void clickOnBButton() {
		buttons.get(0).click();
	}

	public void clickOnIButton() {
		buttons.get(1).click();
	}

	public void clickOnUButton() {
		buttons.get(2).click();
	}

	public void clickOnPrintButton() {
		buttons.get(3).click();
	}

	public void clickAllButtonsExceptPrint() {
		clickOnBButton();
		clickOnIButton();
		clickOnUButton();
	}

	public String styleOfText() {
		return textArea.getAttribute("style");
	}

	public void switchTabOnDriver(){
		String mainWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();

		for(String windowHandle : set){
			if(!windowHandle.equalsIgnoreCase(mainWindow)){
				driver.switchTo().window(windowHandle);
				break;
			}
		}
	}

}
