package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AutoScrollingTab extends BasePage {

	@FindBy(id = "draggable2")
	private WebElement firstDraggableElement;

	@FindBy(id = "draggable3")
	private WebElement secondDraggableElement;

	@FindBy(id = "draggable4")
	private WebElement thirdDraggableElement;

	public AutoScrollingTab() {
		super();
	}

	public void dragAndDropFirstDraggableElement(int xOffset, int yOffset) {
		actions.dragAndDropBy(firstDraggableElement, xOffset, yOffset).build().perform();
	}

	public void dragAndDropSecondDraggableElement(int xOffset, int yOffset) {
		actions.dragAndDropBy(secondDraggableElement, xOffset, yOffset).build().perform();
	}

	public void dragAndDropThirdDraggableElement(int xOffset, int yOffset) {
		actions.dragAndDropBy(thirdDraggableElement, xOffset, yOffset).build().perform();
	}

	public int getXLocationOfFirstDraggableElement() {
		return firstDraggableElement.getLocation().getX();
	}

	public int getYLocationOfFirstDraggableElement() {
		return firstDraggableElement.getLocation().getY();
	}

	public int getXLocationOfSecondDraggableElement() {
		return secondDraggableElement.getLocation().getX();
	}

	public int getYLocationOfSecondDraggableElement() {
		return secondDraggableElement.getLocation().getY();
	}

	public int getXLocationOfThirdDraggableElement() {
		return thirdDraggableElement.getLocation().getX();
	}

	public int getYLocationOfThirdDraggableElement() {
		return thirdDraggableElement.getLocation().getY();
	}

}
