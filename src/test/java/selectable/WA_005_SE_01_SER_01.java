package selectable;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WA_005_SE_01_SER_01 extends Hooks {

	@Test
	public void testSerializePage() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnSelectableLink();
		pages.getWebAutomationPage().clickOnSerializeLink();

		pages.getSerializePage().selectItemWithClick(2);

		Assert.assertTrue(pages.getSerializePage().isSelected(2));
		Assert.assertEquals("You've selected: #2.", pages.getSerializePage().getText());

		pages.getSerializePage().selectWithPressingControl(1, 3, 5);

		Assert.assertTrue(pages.getSerializePage().isSelected(1));
		Assert.assertTrue(pages.getSerializePage().isSelected(3));
		Assert.assertTrue(pages.getSerializePage().isSelected(5));

		Assert.assertEquals("You've selected: #1 #2 #3 #5.", pages.getSerializePage().getText());

		pages.getSerializePage().selectWithMouseAction(1, 3);

		Assert.assertTrue(pages.getSerializePage().isSelected(1));
		Assert.assertTrue(pages.getSerializePage().isSelected(2));
		Assert.assertTrue(pages.getSerializePage().isSelected(3));

		Assert.assertEquals("You've selected: #1 #2 #3.", pages.getSerializePage().getText());
	}

}
