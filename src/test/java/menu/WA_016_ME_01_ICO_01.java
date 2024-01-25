package menu;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WA_016_ME_01_ICO_01 extends Hooks {
    @Test
    public void testIconsPage(){
        pages.getHomePage().clickOnWebautomationLink();
        pages.getWebAutomationPage().clickOnMenuTab();
        pages.getWebAutomationPage().clickOnIconsTab();

        Assert.assertTrue(pages.getIconsPage().isClickableMainIcon("save"));
        Assert.assertTrue(pages.getIconsPage().isClickableMainIcon("zoom out"));
        Assert.assertFalse(pages.getIconsPage().isClickableMainIcon("print..."));

        Assert.assertTrue(pages.getIconsPage().isClickableSubIcon("playback", "Prev"));
    }
}
