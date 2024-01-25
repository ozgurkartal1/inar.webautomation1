package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Handless extends BasePage {

	@FindBy(id = "draggable13")
	private WebElement firstDraggableElement;

	@FindBy(id = "draggable14")
	private WebElement secondDraggableElement;

	@FindBy(css = "#draggable13 > p")
	private WebElement textOfFirstDraggableElement;

	@FindBy(xpath = "//div[@id='draggable14']/p")
	private List<WebElement> textsOfSecondDraggableElement;

	public Handless() {
		super();
	}

	public void dragAndDropFirstDraggableElement(int xOffset, int yOffset) {
		actions.clickAndHold(textOfFirstDraggableElement)
			.dragAndDropBy(firstDraggableElement, xOffset, yOffset)
			.release()
			.build()
			.perform();
	}

	public void dragAndDropSecondDraggableElement(int index, int xOffset, int yOffset) {
		actions.clickAndHold(textsOfSecondDraggableElement.get(index - 1))
			.dragAndDropBy(secondDraggableElement, xOffset, yOffset)
			.release()
			.build()
			.perform();
	}

	public int locationXOfFirstDraggableElement() {
		return firstDraggableElement.getLocation().getX();
	}

	public int locationYOfFirstDraggableElement() {
		return firstDraggableElement.getLocation().getY();
	}

	public int locationXOfSecondDraggableElement() {
		return secondDraggableElement.getLocation().getX();
	}

	public int locationYOfSecondDraggableElement() {
		return secondDraggableElement.getLocation().getY();
	}

}
