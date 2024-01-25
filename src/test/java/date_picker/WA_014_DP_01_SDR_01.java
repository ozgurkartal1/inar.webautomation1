package date_picker;

import base_test.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WA_014_DP_01_SDR_01 extends Hooks {
    @Test
    public void testSelectDateRangePage(){
        //Navigate to Select Date Range Tab
        pages.getHomePage().clickOnWebautomationLink();
        pages.getWebAutomationPage().clickOnDatePickerPage();
        pages.getWebAutomationPage().clickOnSelectDateRangeTab();

        // Select Date For "FROM" Text Field
        pages.getSelectDateRangePage().clickOnFromTextField();
        pages.getSelectDateRangePage().selectMonthFromDropdown("Feb");
        pages.getSelectDateRangePage().selectDayFromMonthsThatAppear("Feb", 1, 23);

        //Verify that we cannot select a month from the dropdown menu before the month we entered the "From" field.
        pages.getSelectDateRangePage().clickOnToTextField();
        Assert.assertFalse(pages.getSelectDateRangePage().selectMonthFromDropdown("Jan"));

        // Verify that a date before the date written in the "From" field is not entered in the "To" field.
        pages.getSelectDateRangePage().selectMonthFromDropdown("Feb");
        Assert.assertFalse(pages.getSelectDateRangePage().selectDayFromMonthsThatAppear("Feb", 1, 22));

        //Verify that a date after the date entered the "From" field can enter the "To" field
        pages.getSelectDateRangePage().selectMonthFromDropdown("Mar");
        pages.getSelectDateRangePage().selectDayFromMonthsThatAppear("Mar", 1, 23);
        Assert.assertFalse(pages.getSelectDateRangePage().isDisplayedDatePicker());

    }
}
