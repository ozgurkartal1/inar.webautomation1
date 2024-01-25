package progress_bar;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WA_013_PB_01_DD_01 extends Hooks {

	@Test
	void testDownloadDiologPage() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnProgressBarPage();
		pages.getWebAutomationPage().clickOnDownloadDiologPage();

		pages.getDownloadDialogPage().clickOnDownloadButton();

		Assert.assertTrue(pages.getDownloadDialogPage().isDisplayedDiologProgressBar());

		pages.getDownloadDialogPage().clickOnCancelDownloadButton();

		Assert.assertFalse(pages.getDownloadDialogPage().isDisplayedDiologProgressBar());
	}

}
