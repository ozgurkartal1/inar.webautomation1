package pages.slider;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import utils.BrowserUtils;

public class SnapToIncrementsPage extends BasePage {
    @FindBy(css = "#slider-snap-to-increments > span")
    private WebElement sliderHandle;

    @FindBy(id = "amount-snap-to-increments")
    private WebElement donationAmountTextField;

    public void pullTheSliderHandleToRight(int amountOfSlideLeft){
        wait.until(ExpectedConditions.visibilityOf(sliderHandle));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#slider-snap-to-increments > span').style.left = '"+ amountOfSlideLeft + "%';");
        BrowserUtils.wait(1);
    }

    public String getValueOfTextField(){
        return donationAmountTextField.getAttribute("value");
    }
}
