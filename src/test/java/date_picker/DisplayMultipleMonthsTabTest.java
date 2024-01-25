package date_picker;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class DisplayMultipleMonthsTabTest extends Hooks {

    @Test
    public void testDisplayMultipleMonthsTab(){
        //Navigate to "Display Multiple Months" tab
        pages.getHomePage().clickOnWebautomationLink();
        pages.getWebAutomationPage().clickOnDatePickerPage();
        pages.getWebAutomationPage().clickOnDisplayMultipleMonthsTab();

        //Click on "Date Text Field"
        pages.getDisplayMultipleMonthsTab().clickOnDateTextField();

        //Verify that 3 months are displayed
        Assert.assertTrue(pages.getDisplayMultipleMonthsTab().isDisplayedThreeMonths());

        //Click on "Next" button
        pages.getDisplayMultipleMonthsTab().clickOnNextButton();

        //Verify that still 3 months are displayed
        Assert.assertTrue(pages.getDisplayMultipleMonthsTab().isDisplayedThreeMonths());

        //Verify that months displayed are "February 2024", "March 2024", "April 2024"
        List<String> months = Arrays.asList("February 2024", "March 2024", "April 2024");
        Assert.assertEquals(pages.getDisplayMultipleMonthsTab().getTextOfMonthsAndYearsDisplayed(), months);

        //Click on "Prev" button
        pages.getDisplayMultipleMonthsTab().clickOnPrevButton();

        //Verify that still three months are displayed
        Assert.assertTrue(pages.getDisplayMultipleMonthsTab().isDisplayedThreeMonths());

        //Verify that months displayed are  "January", "February", "March",
        months = Arrays.asList("January 2024", "February 2024", "March 2024");
        Assert.assertEquals(pages.getDisplayMultipleMonthsTab().getTextOfMonthsAndYearsDisplayed(), months);

        //Select a day from date picker as "25 January 2024"
        pages.getDisplayMultipleMonthsTab().selectDay(1, "25");

        //Verify that selected Date is on Date Text Field
        Assert.assertEquals("01/25/2024", pages.getDisplayMultipleMonthsTab().getValueAttributeOfTextField());

    }
}
