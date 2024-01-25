package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ConstrainMovementPage extends BasePage {

	@FindBy(css = ".draggable-third")
	private List<WebElement> draggableElements;

	@FindBy(id = "draggable8")
	private WebElement lastDrggableElement;

	public ConstrainMovementPage() {
		super();
	}

	private void addLastDraggableElement() {
		draggableElements.remove(draggableElements.size() - 1);
		draggableElements.add(lastDrggableElement);
	}

	public void dragAndDropDraggableElements(int index, int xOffset, int yOffset) {
		addLastDraggableElement();
		WebElement draggableElement = draggableElements.get(index - 1);
		actions.dragAndDropBy(draggableElement, xOffset, yOffset).perform();
	}

	public int getXLocationOfDraggableElement(int index) {
		addLastDraggableElement();
		return draggableElements.get(index - 1).getLocation().getX();
	}

	public int getYLocationOfDraggableElement(int index) {
		addLastDraggableElement();
		return draggableElements.get(index - 1).getLocation().getY();
	}

}
