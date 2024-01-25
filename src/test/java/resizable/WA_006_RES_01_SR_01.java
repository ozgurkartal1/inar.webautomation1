package resizable;

import base_test.Hooks;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WA_006_RES_01_SR_01 extends Hooks {

	@Test
	void testSyncronusResizePage() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnResizableLink();
		pages.getWebAutomationPage().clickOnSynchronusResizeLink();

		Dimension initialDimOfFirstElement = pages.getsynchronusResizePage().getSizeOfFirstResizeableElement();
		Dimension initialDimOfSecondElement = pages.getsynchronusResizePage().getSizeOfSecondResizeableElement();

		pages.getsynchronusResizePage().resizeFirstResizeableElement(50, 50);

		Dimension finalDimOfFirstElement = pages.getsynchronusResizePage().getSizeOfFirstResizeableElement();
		Dimension finalDimOfSecondElement = pages.getsynchronusResizePage().getSizeOfSecondResizeableElement();

		Assert.assertNotEquals(initialDimOfFirstElement, finalDimOfFirstElement);
		Assert.assertNotEquals(initialDimOfSecondElement, finalDimOfSecondElement);

		pages.getsynchronusResizePage().resizeSecondResizeableElement(-50, -50);

		Dimension final2DimOfFirstElement = pages.getsynchronusResizePage().getSizeOfFirstResizeableElement();
		Dimension final2DimOfSecondElement = pages.getsynchronusResizePage().getSizeOfSecondResizeableElement();

		Assert.assertEquals(final2DimOfFirstElement, finalDimOfFirstElement);
		Assert.assertNotEquals(final2DimOfSecondElement, finalDimOfSecondElement);

	}

}
