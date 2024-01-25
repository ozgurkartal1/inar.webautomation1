package spinner;

import base_test.Hooks;
import org.testng.annotations.Test;

public class SpinnerOverFlowTest extends Hooks {

    @Test
    public void testSpinnerOverFlow(){
        //Navigate to "Spinner OverFlow" tab
        pages.getHomePage().clickOnWebautomationLink();
        pages.getWebAutomationPage().clickOnSpinnerTab();
        pages.getWebAutomationPage().clickOnSpinnerOverflowTab();

        //Clear "Spinner Text Field"
        pages.getSpinnerOverflow().clearSpinnerTextField();

        //Send value to Text Field as "10"
        pages.getSpinnerOverflow().sendValueToSpinnerTextField("10");

        //Click on "Up" button
        pages.getSpinnerOverflow().clickOnUpButton();

        //Verify that text in "Spinner Text Field" is -10
        softAssert.assertEquals("-10", pages.getSpinnerOverflow().getTextOfSpinner());

        //Click on "Down" button
        pages.getSpinnerOverflow().clickOnDownButton();

        //Verify that text in "Spinner Text Field" is 10
        softAssert.assertEquals("10", pages.getSpinnerOverflow().getTextOfSpinner());

        //Verify All
        softAssert.assertAll();

    }
}
