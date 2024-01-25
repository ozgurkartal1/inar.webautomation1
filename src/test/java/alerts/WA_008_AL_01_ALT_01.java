package alerts;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class WA_008_AL_01_ALT_01 extends Hooks {

	@Test
	public void testAlertsTypePage() {
		pages.getHomePage().clickOnWebautomationLink();
		BrowserUtils.pageDown();
		pages.getWebAutomationPage().clickOnAlertLink();

		BrowserUtils.pageUp();
		pages.getAlertsTypePage().clickOnShowConfirmButton();

		pages.getAlertsTypePage().confirmTheAlert();
		String actualText = pages.getAlertsTypePage().getTextMessageOnAlert();

		pages.getAlertsTypePage().confirmTheAlert();

		Assert.assertEquals("Confirmed!", actualText);

		pages.getAlertsTypePage().clickOnShowPromptButton();
		pages.getAlertsTypePage().sendTextToAlert("Emir Uyanık");
		pages.getAlertsTypePage().confirmTheAlert();

		actualText = pages.getAlertsTypePage().getTextMessageOnAlert();

		pages.getAlertsTypePage().confirmTheAlert();

		Assert.assertEquals("Hello, Emir Uyanık!", actualText);
	}

}
