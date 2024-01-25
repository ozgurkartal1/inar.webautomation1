package accordion;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WA_015_AC_01_CC_01 extends Hooks {

    @Test
    public void testCollapseContentPage(){
        //Navigate to collapse content tab on WebAutomation home page
        pages.getHomePage().clickOnWebautomationLink();
        pages.getWebAutomationPage().clickOnAccordionTab();
        pages.getWebAutomationPage().clickOnCollapseContentTab();

        //Verify that the first accordion content is visible on first access to this tab
        Assert.assertTrue(pages.getCollapseContentPage().isDisplayedAccordionContent(1));

        //Click on second accordion header to display second accordion content
        pages.getCollapseContentPage().clickOnAccordionHeader(2);

        //Verify that first accordion content is invisible and second one is visible
        Assert.assertTrue(pages.getCollapseContentPage().isDisplayedAccordionContent(2));
        Assert.assertFalse(pages.getCollapseContentPage().isDisplayedAccordionContent(1));
    }
}
