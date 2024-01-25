package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DefaultFunctionalityTab extends BasePage {

	@FindBy(id = "draggable")
	private WebElement draggableElement;

	public DefaultFunctionalityTab() {
		super();
	}

	public void dragAndDropDraggableElement(int xOffset, int yOffset) {
		actions.dragAndDropBy(draggableElement, xOffset, yOffset).perform();
	}

	public int getXLocationOfDraggableElement() {
		return draggableElement.getLocation().getX();
	}

	public int getYLocationOfDraggableElement() {
		return draggableElement.getLocation().getY();
	}

}
