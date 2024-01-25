package pages.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class DisplayMultipleMonthsTab extends BasePage {
    @FindBy(id = "datepicker-multiple-months")
    private WebElement dateTextField;

    @FindBy(css = ".ui-datepicker-calendar")
    private List<WebElement> displayedMonthsOnDatePicker;

    @FindBy(css = ".ui-datepicker-header > div")
    private List<WebElement> monthsAndYearsDisplayed;

    @FindBy(xpath = "//a[@title='Next']")
    private WebElement nextButton;

    @FindBy(xpath = "//span[text()='Prev']")
    private WebElement prevButton;

    @FindBy(xpath = "//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']/../../../../div")
    private WebElement todayMonthAndYear;

    @FindBy(css = ".ui-datepicker-today")
    private WebElement dayOfToday;


    public boolean isDisplayedThreeMonths(){
        return displayedMonthsOnDatePicker.size() == 3;
    }

    public String getValueAttributeOfTextField(){
        return dateTextField.getAttribute("value");
    }

    public List<String> getTextOfMonthsAndYearsDisplayed(){
        return monthsAndYearsDisplayed.stream().map(WebElement::getText).toList();
    }

    public void clickOnPrevButton(){
        prevButton.click();
        BrowserUtils.wait(1);
    }

    public void clickOnNextButton(){
        nextButton.click();
        BrowserUtils.wait(1);
    }

    public void clickOnDateTextField(){
        dateTextField.click();
        BrowserUtils.wait(1);
    }

    public String getTodayDay(){
        String newStr = todayMonthAndYear.getText().substring(4);
        String[] array = newStr.split(" ");
        return dayOfToday.getText() + "/" + array[0] + "/" + array[1];
    }

    public void selectDay(int indexOfMonth, String day){
        List<WebElement> elements = displayedMonthsOnDatePicker.get(indexOfMonth - 1).findElements(By.tagName("td")).stream().
                filter(element -> element.getAttribute("class").equals(" ")).toList();
        List<String> days = elements.stream().map(WebElement::getText).toList();

        elements.get(days.indexOf(day)).click();

        BrowserUtils.wait(1);
    }
}
