package pages.resizeable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class TextAreaPage extends BasePage {

	@FindBy(xpath = "(//div[@class='ui-wrapper']/div)[3]")
	private WebElement holder;

	@FindBy(id = "resizable-text-area-res")
	private WebElement textBox;

	public TextAreaPage() {
		super();
	}

	public void resizeTextBox(int xOffset, int yOffset) {
		actions.clickAndHold(holder).moveByOffset(xOffset, yOffset).release().perform();
	}

	public int widthOfTheTextBox() {
		return textBox.getSize().getWidth();
	}

	public int heigthOfTheTextBox() {
		return textBox.getSize().getHeight();
	}

}
