package pages.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class SelectDateRangePage extends BasePage {

    @FindBy(id = "from-selectDateRange")
    private WebElement fromTextField;

    @FindBy(id = "to-selectDateRange")
    private WebElement toTextField;

    @FindBy(id = "ui-datepicker-div")
    private WebElement datePicker;

    @FindBy(css = ".ui-datepicker-title > select")
    private WebElement monthSelectorOfFromTextField;

    @FindBy(css = ".ui-datepicker-calendar > tbody")
    public List<WebElement> monthsIsDisplayed;

    public SelectDateRangePage(){
        super();
    }

    public void clickOnFromTextField(){
        fromTextField.click();
    }

    public void clickOnToTextField(){
        toTextField.click();
    }

    public boolean selectMonthFromDropdown(String month){
        Select select = new Select(monthSelectorOfFromTextField);
        try{
            select.selectByVisibleText(month);
        }catch (NoSuchElementException e){
            return false;
        }
        return true;
    }

    public boolean selectDayFromMonthsThatAppear(String selectedMonthFromDropdown, int indexOfMonthsThatAppear, int day){
        List<WebElement> days = monthsIsDisplayed.get(indexOfMonthsThatAppear - 1).findElements(By.tagName("td"));
        int count = 0;
        while(!isClickable(days.get(count))){
            count++;
        }
        try {
            days.get(day + count - 1).click();
        }catch (IndexOutOfBoundsException e){
            return false;
        }

        return selectMonthFromDropdown(selectedMonthFromDropdown);
    }

    private boolean isClickable(WebElement day) {
        return !day.getAttribute("class").contains("ui-state-disabled");
    }

    public boolean isDisplayedDatePicker(){
        BrowserUtils.wait(1);
        return datePicker.isDisplayed();
    }


}
