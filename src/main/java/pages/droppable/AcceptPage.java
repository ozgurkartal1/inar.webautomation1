package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AcceptPage extends BasePage {

	@FindBy(id = "draggable-nonvalid-accept")
	private WebElement nonDroppableElement;

	@FindBy(id = "draggable-accept")
	private WebElement droppableElement;

	@FindBy(id = "droppable-accept")
	private WebElement targetElement;

	@FindBy(css = "#droppable-accept")
	private WebElement textFieldOnTargetElement;

	public AcceptPage() {
		super();
	}

	public void dragAndDropNonDroppableElement() {
		actions.dragAndDrop(nonDroppableElement, targetElement).build().perform();
	}

	public void dragAndDropDroppableElement() {
		actions.dragAndDrop(droppableElement, targetElement).build().perform();
	}

	public String getTextOnTargetElement() {
		return textFieldOnTargetElement.getText();
	}

}
