package control_group;

import base_test.Hooks;
import org.testng.annotations.Test;

public class WA_011_CG_01_TB_01 extends Hooks {

	@Test
	void testToolbarPage() {
		//Navigate to Toolbar Tab
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnControlGroupPage();
		pages.getWebAutomationPage().clickOnToolbarPage();

		//Select features from all selections
		pages.getToolbarPage().selectAllInfo("125%", "Red", "Yellow");

		//Click all buttons except for "Print" button
		pages.getToolbarPage().clickOnBButton();
		pages.getToolbarPage().clickOnIButton();

		//Get final style attribute of WebElement
		String finalStyle = pages.getToolbarPage().styleOfText();

		//Verify that all features are implemented
		softAssert.assertTrue(finalStyle.contains("zoom: 125%"));
		softAssert.assertTrue(finalStyle.contains("background-color: red"));
		softAssert.assertTrue(finalStyle.contains("color: yellow"));
		softAssert.assertTrue(finalStyle.contains("font-weight: bold"));
		softAssert.assertTrue(finalStyle.contains("font-style: italic"));

		softAssert.assertAll();
	}

}
