package dialog;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WA_012_DIA_01_MF_01 extends Hooks {

	@Test
	public void testModalFormPage() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnDialogPage();
		pages.getWebAutomationPage().clickOnModalTabPage();

		pages.getModalFormPage().clickOnCreateAccountButton();

		List<String> expectedData = pages.getModalFormPage()
			.enterAllDataOnDiologPage("Özgür", "Kartal", "asds@gmail.com");

		Assert.assertEquals(expectedData, pages.getModalFormPage().getAllDataOfLastUser());
	}

}
