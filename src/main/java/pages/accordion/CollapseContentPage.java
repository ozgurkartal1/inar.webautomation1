package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class CollapseContentPage extends BasePage {
    @FindBy(xpath = "//div[@id='accordion-2-cc']/h3")
    protected List<WebElement> accordionHeaders;

    @FindBy(xpath = "//div[@id='accordion-2-cc']/div")
    protected List<WebElement> accordionContents;


    public CollapseContentPage(){
        super();
    }

    public void clickOnAccordionHeader(int index){
        accordionHeaders.get(index - 1).click();
        BrowserUtils.wait(1);
    }

    public boolean isDisplayedAccordionContent(int index){
        return accordionContents.get(index - 1).isDisplayed();
    }


}
