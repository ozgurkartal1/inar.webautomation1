package slider;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends Hooks {

    @Test
    void testSlider(){
        //Navigate to "Snap to Increments Tab"
        pages.getHomePage().clickOnWebautomationLink();
        pages.getWebAutomationPage().clickOnSliderTab();
        pages.getWebAutomationPage().clickOnSnapToIncrementsTab();

        //Pull the slider to $100 level.
        pages.getSnapToIncrementsPage().pullTheSliderHandleToRight(20);

        //Verify that value of text is $100
        Assert.assertEquals("$100", pages.getSnapToIncrementsPage().getValueOfTextField());



    }
}
