package pages.resizeable;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SynchronusResizePage extends BasePage {

	@FindBy(xpath = "(//div[@id='resizable-synchr-resize']/div)[3]")
	private WebElement resizeIcon1;

	@FindBy(xpath = "(//div[@id='also-synchr-resize']/div)[3]")
	private WebElement resizeIcon2;

	@FindBy(id = "resizable-synchr-resize")
	private WebElement firstResizeableElement;

	@FindBy(id = "also-synchr-resize")
	private WebElement secondResizeableElement;

	public SynchronusResizePage() {
		super();
	}

	public void resizeFirstResizeableElement(int xOffset, int yOffset) {
		actions.clickAndHold(resizeIcon1).moveByOffset(xOffset, yOffset).release().perform();
	}

	public void resizeSecondResizeableElement(int xOffset, int yOffset) {
		actions.clickAndHold(resizeIcon2).moveByOffset(xOffset, yOffset).release().perform();
	}

	public Dimension getSizeOfFirstResizeableElement() {
		return firstResizeableElement.getSize();
	}

	public Dimension getSizeOfSecondResizeableElement() {
		return secondResizeableElement.getSize();
	}

}
