package draggable;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WA_001_DR_01_CM_01 extends Hooks {

	@Test
	public void testMovementsOfDraggableElements() {
		// Navigate to the WebPage
		// Click on "Webautomation" Link
		pages.getHomePage().clickOnWebautomationLink();

		// Click on "Draggable" Link
		pages.getWebAutomationPage().clickOnDraggableLink();

		// Click on "Constrain Movement" Link
		pages.getWebAutomationPage().clickOnConstrainMovementLink();

		// Initial X and Y location of first draggable element
		int initialXOfFirstElement = pages.getConstrainMovementPage().getXLocationOfDraggableElement(1);
		int initialYOfFirstElement = pages.getConstrainMovementPage().getYLocationOfDraggableElement(1);

		// Drag and drop first draggable element
		pages.getConstrainMovementPage().dragAndDropDraggableElements(1, 100, 100);

		// Final X and Y location of the first Draggable Element
		int finalXOfFirstElement = pages.getConstrainMovementPage().getXLocationOfDraggableElement(1);
		int finalYOfFirstElement = pages.getConstrainMovementPage().getYLocationOfDraggableElement(1);

		// Verify the first draggable element moves just vertically
		Assert.assertEquals(initialXOfFirstElement, finalXOfFirstElement);
		Assert.assertTrue(initialYOfFirstElement < finalYOfFirstElement);

		// Initial X and Y location of second draggable element
		int initialXOfSecondElement = pages.getConstrainMovementPage().getXLocationOfDraggableElement(2);
		int initialYOfSecondElement = pages.getConstrainMovementPage().getYLocationOfDraggableElement(2);

		// Drag and drop first draggable element
		pages.getConstrainMovementPage().dragAndDropDraggableElements(2, 100, 100);

		// Final X and Y location of the second Draggable Element
		int finalXOfSecondElement = pages.getConstrainMovementPage().getXLocationOfDraggableElement(2);
		int finalYOfSecondElement = pages.getConstrainMovementPage().getYLocationOfDraggableElement(2);

		// Verify the second draggable element moves just horizontally
		Assert.assertEquals(initialYOfSecondElement, finalYOfSecondElement);
		Assert.assertTrue(initialXOfSecondElement < finalXOfSecondElement);

		int initialXOfThirdElement = pages.getConstrainMovementPage().getXLocationOfDraggableElement(3);
		int initialYOfThirdElement = pages.getConstrainMovementPage().getYLocationOfDraggableElement(3);

		pages.getConstrainMovementPage().dragAndDropDraggableElements(3, -100, -100);

		int finalXOfThirdElement = pages.getConstrainMovementPage().getXLocationOfDraggableElement(3);
		int finalYOfThirddElement = pages.getConstrainMovementPage().getYLocationOfDraggableElement(3);

		Assert.assertTrue(initialYOfSecondElement - 100 < finalYOfSecondElement);
		Assert.assertTrue(initialXOfSecondElement - 100 < finalXOfSecondElement);

		int initialXOfFourthElement = pages.getConstrainMovementPage().getXLocationOfDraggableElement(4);
		int initialYOfFourthElement = pages.getConstrainMovementPage().getYLocationOfDraggableElement(4);

		pages.getConstrainMovementPage().dragAndDropDraggableElements(4, -100, -100);

		int finalXOfFourthElement = pages.getConstrainMovementPage().getXLocationOfDraggableElement(4);
		int finalYOfFourthdElement = pages.getConstrainMovementPage().getYLocationOfDraggableElement(4);

		Assert.assertTrue(initialYOfSecondElement - 100 < finalYOfSecondElement);
		Assert.assertTrue(initialXOfSecondElement - 100 < finalXOfSecondElement);

	}

}
