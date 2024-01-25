package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RevertDraggablePositionPage extends BasePage {

	@FindBy(id = "draggable-revert-draggable")
	private WebElement revertedDraggable;

	@FindBy(id = "draggable2-revert-draggable")
	private WebElement revertedDraggable2;

	@FindBy(id = "droppable-revert-draggable")
	private WebElement targetElement;

	public RevertDraggablePositionPage() {
		super();
	}

	public void moveFirstrevertedDraggableToTargetElement() {
		actions.clickAndHold(revertedDraggable).moveToElement(targetElement).release().build().perform();
	}

	public void moveSecondrevertedDraggableElementToTargetElement() {
		actions.clickAndHold(revertedDraggable2).moveToElement(targetElement).release().build().perform();
	}

	public int getXLocationOfFirstRevertedDraggable() {
		return revertedDraggable.getLocation().getX();
	}

	public int getYLocationOfFirstRevertedDraggable() {
		return revertedDraggable.getLocation().getY();
	}

	public int getXLocationOfSecondRevertedDraggable() {
		return revertedDraggable2.getLocation().getX();
	}

	public int getYLocationOfSecondRevertedDraggable() {
		return revertedDraggable2.getLocation().getY();
	}

}
