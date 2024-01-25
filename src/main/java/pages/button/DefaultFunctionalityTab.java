package pages.button;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class DefaultFunctionalityTab extends BasePage {
    //Widget Buttons
    @FindBy(css = ".widget .me-3")
    private List<WebElement> widgetButtons;

    //Css Buttons
    @FindBy(xpath = "//h1[text()='CSS Buttons']/../button")
    private WebElement aButtonElement;
    @FindBy(xpath = "//h1[text()='CSS Buttons']/../input")
    private WebElement gönderButton;

    @FindBy(xpath = "//h1[text()='CSS Buttons']/../a")
    private WebElement anAnchorButton;




}
