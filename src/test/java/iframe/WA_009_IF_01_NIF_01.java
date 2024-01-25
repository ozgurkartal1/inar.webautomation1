package iframe;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class WA_009_IF_01_NIF_01 extends Hooks {

	@Test
	public void testPlease() {
		pages.getHomePage().clickOnWebautomationLink();
		BrowserUtils.pageDown();
		BrowserUtils.wait(1);
		pages.getWebAutomationPage().clickOnIframeLink();

		BrowserUtils.pageUp();
		BrowserUtils.wait(1);
		pages.getWebAutomationPage().clickOnNormalIframeLink();

		Assert.assertEquals("Inar academy", pages.getNormalIframePage().getTitleOnFrame());
	}

}
