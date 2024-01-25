package pages.selectable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class SerializePage extends BasePage {

	@FindBy(css = "#selectable-serialize > li")
	private List<WebElement> items;

	@FindBy(id = "feedback-serialize")
	private WebElement text;

	public SerializePage() {
	}

	public void selectItemWithClick(int index) {
		items.get(index - 1).click();
	}

	public void selectWithMouseAction(int index1, int index2) {
		actions.clickAndHold(items.get(index1 - 1)).moveToElement(items.get(index2 - 1)).release().perform();
	}

	public void selectWithPressingControl(int i1, int i2, int i3) {
		actions.keyDown(Keys.CONTROL)
			.click(items.get(i1 - 1))
			.click(items.get(i2 - 1))
			.click(items.get(i3 - 1))
			.keyUp(Keys.CONTROL)
			.perform();
	}

	public String getText() {
		return text.getText();
	}

	public boolean isSelected(int index) {
		return items.get(index - 1).getAttribute("class").contains("ui-selected");
	}

}
