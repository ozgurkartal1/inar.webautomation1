package pages.spinner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SpinnerOverflow extends BasePage {
    @FindBy(id = "spinner-overflow")
    private WebElement spinnerTextField;

    @FindBy(xpath = "//input[@id='spinner-overflow']/..//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")
    private WebElement upButton;

    @FindBy(xpath = "//input[@id='spinner-overflow']/..//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']")
    private WebElement downButton;

    public void sendValueToSpinnerTextField(String value){
        spinnerTextField.sendKeys(value);
    }

    public void clearSpinnerTextField(){
        spinnerTextField.clear();
    }

    public void clickOnDownButton(){
        downButton.click();
    }

    public void clickOnUpButton(){
        upButton.click();
    }

    public String getTextOfSpinner(){
        return spinnerTextField.getAttribute("aria-valuenow");
    }
}
