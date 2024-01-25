package draggable;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WA_002_DR_02_HL_01 extends Hooks {

	@Test
	public void testHandlesPage() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnDraggableLink();
		pages.getWebAutomationPage().clickOnHandlessLink();

		int initialXOfFirstDraggableElement = pages.getHandlessPage().locationXOfFirstDraggableElement();
		int initialYOfFirstDraggableElement = pages.getHandlessPage().locationYOfFirstDraggableElement();

		pages.getHandlessPage().dragAndDropFirstDraggableElement(100, 100);

		int finalXOfFirstDraggableElement = pages.getHandlessPage().locationXOfFirstDraggableElement();
		int finalYOfFirstDraggableElement = pages.getHandlessPage().locationYOfFirstDraggableElement();

		Assert.assertTrue(finalXOfFirstDraggableElement > initialXOfFirstDraggableElement);
		Assert.assertTrue(finalYOfFirstDraggableElement > initialYOfFirstDraggableElement);

		int initialXOfSecondDraggableElement = pages.getHandlessPage().locationXOfSecondDraggableElement();
		int initialYOfSecondDraggableElement = pages.getHandlessPage().locationYOfSecondDraggableElement();

		pages.getHandlessPage().dragAndDropSecondDraggableElement(2, 30, 30);

		int finalXOfSecondDraggableElement = pages.getHandlessPage().locationXOfSecondDraggableElement();
		int finalYOfSecondDraggableElement = pages.getHandlessPage().locationYOfSecondDraggableElement();

		Assert.assertEquals(finalXOfSecondDraggableElement, initialXOfSecondDraggableElement);
		Assert.assertEquals(finalYOfSecondDraggableElement, initialYOfSecondDraggableElement);

		pages.getHandlessPage().dragAndDropSecondDraggableElement(1, 50, 50);
		finalXOfSecondDraggableElement = pages.getHandlessPage().locationXOfSecondDraggableElement();
		finalYOfSecondDraggableElement = pages.getHandlessPage().locationYOfSecondDraggableElement();

		Assert.assertNotEquals(initialXOfSecondDraggableElement, finalXOfSecondDraggableElement);
		Assert.assertNotEquals(initialYOfSecondDraggableElement, finalYOfSecondDraggableElement);

	}

}
